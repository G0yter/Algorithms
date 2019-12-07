package com.gmail.goyter012.searching;

public class Binary {


    //only sorted
    public static int  binarySearch(int[] arr, int start, int end, int toFind){
        if(start <= end){
            int middle = start + (end - start)/2;
            if(arr[middle] == toFind){
                return middle;
            }

            if(arr[middle] > toFind){
                return binarySearch(arr, start, middle -1, toFind);
            }else{
                return binarySearch(arr,middle + 1, end, toFind);
            }

        }
        return -1;

    }



}
