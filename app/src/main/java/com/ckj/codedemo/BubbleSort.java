package com.ckj.codedemo;

/**
 * 冒泡排序
 * Created by chenkaijian on 16-7-20.
 */
public class BubbleSort {

    public static void bubbleSort(int[] arg) {
        for (int i = 0; i < arg.length - 1; i++) {
            for (int j = 0; j < arg.length - 1; j++) {
                if (arg[j] > arg[j + 1]) {
                    int temp = arg[j];
                    arg[j] = arg[j + 1];
                    arg[j + 1] = temp;
                }
            }
        }

        for (int m : arg) {
            System.out.print(m + " ");
        }
    }

    public static void main(String[] args) {
        int[] arg = new int[]{2,1,4,5,8,7,6,3,9,0};
        bubbleSort(arg);
    }
}
