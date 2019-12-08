package com.gmail.goyter012.searching;

public class Linear {

    public static int linearSearch(int[] arr, int toFind){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }





}
