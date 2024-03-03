package com.atguigu1.one.exer3;

public class quickSortarr {
    //O(nlogn)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);//对【low，pi-1】的部分进行操作
            quickSort(arr, pi+1, high);//对【pi-1,high】的部分进行操作
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);

        for(int j=low; j<=high-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int length = arr.length;

        quickSort(arr, 0, length-1);

        for(int i:arr) {
            System.out.print(i+" ");
        }
    }

}
