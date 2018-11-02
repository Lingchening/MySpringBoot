package com.example.zl.sort;

public class Sort {
    public static void main(String[] args) {
        // 静态初始化
        //int intArray2 [] = new int[]{20,21,22};
        // 静态初始化简化方式
        //int intArray3 [] = {30,31,32};
        // 动态初始化
        //int[] intArray4 = new int[3];

        int[] arr = new int[]{49, 38, 65, 97, 76, 13, 27};
        int[] b = insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(b[i] + ",");
        }
    }

    public static int[] insertSort(int[] arr) {
        int i, j, temp;

        for (i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static int[] binaryInsertSort(int[] arr) {
        return null;
    }
}