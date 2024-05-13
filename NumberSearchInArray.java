package DSA;

import java.util.Scanner;

public class NumberSearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int searchNum = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == searchNum) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + searchNum + " exists in the array " + count + " time(s).");
        } else {
            System.out.println("The number " + searchNum + " does not exist in the array.");
        }
    }
}
