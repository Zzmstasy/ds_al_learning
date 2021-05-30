package com.zzmstasy.algorithm.sort;

/**
 * @author Zzmstasy
 * @date 2021/05/30 23:18
 */
public class SelectionSort {
    public static void execute(int[] ints) {
        if (ints==null||ints.length<=1) return;
        for (int i = 0; i < ints.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ints.length; j++) {
                minIndex = ints[minIndex] > ints[j] ? j : minIndex;
            }
            swap(ints, i, minIndex);
        }
    }
    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
    public static void main(String[] args) {
        int[] ints = {5, 6, 3, 2, 4, 1};
        execute(ints);
        System.out.println("args = " + args);
    }
}
