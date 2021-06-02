package com.company;

public class BubbleSort {
    static int[] array = new int[]{99, 19, 20, 10, 0, 2, 3, 1, 65, 43, 23, 56, 7, 76, 45, 32, 12, 100, 44, 33};

    static int[] sort(int[] array) {
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
        return array;
    }

    static int[] printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        printArray(array);
        sort(array);
    }
}
