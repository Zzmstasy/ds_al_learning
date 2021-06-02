package com.zzmstasy.algorithm.sort;

/**
 * @author Zzmstasy
 * @date 2021/06/02 22:32
 */
public class QuickSort {
    public static void execute_v1(int[] ints, int left, int right) {
        int s = ints[right];
        int lastSmallIndex = left - 1;
        for (int i = left; i < right; i++) {
            if (ints[i] <= s) swap(ints, ++lastSmallIndex, i);
        }
        swap(ints, lastSmallIndex + 1, right);
        if (lastSmallIndex > left) execute_v1(ints, left, lastSmallIndex);
        if (lastSmallIndex + 1 < right) execute_v1(ints, lastSmallIndex + 2, right);
    }

    public static void execute_v2(int[] ints, int left, int right) {
        int s = ints[right];
        int lastSmallIndex = left - 1;
        int firstBigIndex = right;
        for (int i = left; i < right; i++) {
            if (ints[i] < s) swap(ints, ++lastSmallIndex, i);
        }
        for (int i = firstBigIndex - 1; i > lastSmallIndex; i--) {
            if (ints[i] > s) swap(ints, --firstBigIndex, i);
        }
        swap(ints, firstBigIndex, right);
        if (lastSmallIndex > left) execute_v2(ints, left, lastSmallIndex);
        if (firstBigIndex + 1 < right) execute_v2(ints, firstBigIndex, right);
    }

    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public static void main(String[] args) {
        int[] ints = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
//        execute_v1(ints,0,ints.length-1);
        execute_v2(ints, 0, ints.length - 1);
        System.out.println("ints = " + ints);
    }
}
