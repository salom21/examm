package DSA;

import java.util.Arrays;

public class ArrayOperation{ 
    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        System.out.println("The first Array: " + Arrays.toString(array));
        int[] modifiedArray = deleteElement(array, indexToDelete);
        System.out.println("The new Array: " + Arrays.toString(modifiedArray));

      
        int invalidIndex = 5;
        System.out.println("The first Array: " + Arrays.toString(array));
        int[] unchangedArray = deleteElement(array, invalidIndex);
        System.out.println("Unchanged Array: " + Arrays.toString(unchangedArray));
    }
}
