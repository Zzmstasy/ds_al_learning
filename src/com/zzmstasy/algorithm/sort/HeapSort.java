package com.zzmstasy.algorithm.sort;

/**
 * @author Zzmstasy
 * @date 2021/06/03 21:51
 */
public class HeapSort {
    public static void execute(int[] ints, int left, int right) {
        int heapSize = right - left + 1;
        for (int i = right; i >= left; i--) {
            heapify(ints, i, heapSize);
        }
        while (heapSize > 0) {
            swap(ints, left, right--);
            heapify(ints, left, --heapSize);
        }
    }

    public static void heapInsert(int[] ints, int index) {
        while (ints[index] > ints[(index - 1) / 2]) {
            swap(ints, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] ints, int index, int heapSize) {
        int leftChild = 2 * index + 1;
        int rightChild = leftChild + 1;
        while (leftChild < heapSize) {
            int largest = leftChild;
            if (rightChild < heapSize)
                largest = ints[leftChild] > ints[rightChild] ? leftChild : rightChild;
            if (ints[largest] > ints[index]) {
                swap(ints, largest, index);
            } else {
                break;
            }
            index = largest;
            leftChild = 2 * index + 1;
        }
    }

    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public static void main(String[] args) {
        int[] ints = {2, 1, 3};
        int[] ints2 = {2, 1, 3};
        int[] ints3 = {2, 1, 3,5,4,3,7,1};
        heapInsert(ints, 2);
        heapify(ints2, 0, 3);
        execute(ints3, 0, ints3.length-1);
        System.out.println("ints2 = " + ints2);
    }
}
