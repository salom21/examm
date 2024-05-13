package DSA;

import java.util.Arrays;

public class Letters {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'b', 'a', 'd', 'c', 'f', 'e'};
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}