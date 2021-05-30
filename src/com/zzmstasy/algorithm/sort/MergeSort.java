package com.zzmstasy.algorithm.sort;

/**
 * @author Zzmstasy
 * @date 2021/05/30 23:18
 */
public class MergeSort {
    public static void execute(int[] ints, int left, int right) {
        if (ints==null||ints.length<=1||left == right) return;
        int mid = left + ((right - left) >> 1);
        execute(ints, left, mid);
        execute(ints, mid + 1, right);
        merge(ints, left, mid, right);
    }

    private static void merge(int[] ints, int left, int mid, int right) {
        int[] mergeInts = new int[right - left + 1];
        int m = 0;

        int leftPoint = left;
        int rightPoint = mid + 1;
        while (leftPoint <= mid && rightPoint <= right) {
            mergeInts[m++] = ints[leftPoint] < ints[rightPoint] ? ints[leftPoint++] : ints[rightPoint++];
        }
        while (leftPoint <= mid) {
            mergeInts[m++] = ints[leftPoint++];
        }
        while (rightPoint <= right) {
            mergeInts[m++] = ints[rightPoint++];
        }

        for (int i = left; i <= right; i++) {
            ints[i] = mergeInts[i - left];
        }
    }

    public static void main(String[] args) {
        int[] ints = {5, 6, 3, 2, 4, 1};
        execute(ints, 0, 5);
        System.out.println("args = " + args);
    }
}
