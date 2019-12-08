package com.gmail.goyter012.sorting;

public class Simple {

    private static  void swap(int[] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void bubbleSorting(int[] array){
        boolean needIteration = true;
        for(;needIteration;) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public static void insectSorting(int[] array){
        for(int left = 0; left < array.length; left++){
            int value = array[left];
            int i = left -1;

            for(;i >= 0;i--){
                if(value < array[i]){
                    array[i+1] = array[i];
                }
                else{
                    break;
                }
            }
            array[i+1] = value;
        }

    }

    public static void selectSorting(int [] array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }


}
