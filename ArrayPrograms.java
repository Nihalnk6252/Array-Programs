import java.util.Scanner;

public class ArrayProgramsSet01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Declare and print an array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("1. Declared array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2. Input and output elements of an array
        System.out.print("\n2. Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // 3. Find the sum of elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("\n\n3. Sum: " + sum);

        // 4. Find the average
        float avg = (float)sum / n;
        System.out.println("4. Average: " + avg);

        // 5. Find the maximum element
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("5. Max: " + max);

        // 6. Find the minimum element
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("6. Min: " + min);

        // 7. Count even and odd numbers
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("7. Even: " + even + ", Odd: " + odd);

        // 8. Elements at even indices
        System.out.print("8. Elements at even indices: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 9. Elements at odd indices
        System.out.print("9. Elements at odd indices: ");
        for (int i = 1; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 10. Count positive and negative numbers
        int pos = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0)
                pos++;
            else
                neg++;
        }
        System.out.println("10. Positive: " + pos + ", Negative: " + neg);

        // 11. Replace all negative numbers with 0
        System.out.print("11. Replaced negatives with 0: ");
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) a[i] = 0;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 12. Linear Search
        System.out.print("12. Enter element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == search) {
                found = true;
                break;
            }
        }
        System.out.println("Found? " + (found ? "Yes" : "No"));

        // 13. Copy an array
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = a[i];
        }
        System.out.print("13. Copied array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        // 14. Reverse an array
        System.out.print("14. Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 15. Swap first and last
        int temp = a[0];
        a[0] = a[n - 1];
        a[n - 1] = temp;
        System.out.print("15. Swapped first and last: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 16. Print array in reverse order
        System.out.print("16. Reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 17. Count frequency of a number
        System.out.print("17. Enter number to count frequency: ");
        int freq = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == freq) {
                count++;
            }
        }
        System.out.println("Frequency of " + freq + ": " + count);

        // 18. Find index of a specific element
        System.out.print("18. Enter number to find index: ");
        int find = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == find) {
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Index of " + find + ": " + index);

        // 19. Replace all even numbers with -1
        System.out.print("19. Even numbers replaced with -1: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                a[i] = -1;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 20. Multiply all elements
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= a[i];
        }
        System.out.println("20. Product of all elements: " + product);
    }
}
