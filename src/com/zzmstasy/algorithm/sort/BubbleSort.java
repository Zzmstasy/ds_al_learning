package com.zzmstasy.algorithm.sort;

/**
 * @author Zzmstasy
 * @date 2021/05/30 23:18
 */
public class BubbleSort {
    public static void execute(int[] ints) {
        if (ints==null||ints.length<=1) return;
        for (int i = ints.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[j + 1]) swap(ints, j, j + 1);
            }
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
