package com.gmail.goyter012;

import com.gmail.goyter012.searching.Binary;
import com.gmail.goyter012.searching.Linear;
import com.gmail.goyter012.sorting.Quick;
import com.gmail.goyter012.sorting.Simple;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {

        int[] arr = new int[] {1,6,3,65,11,98,35,27,9,53,49,21,36};
        Quick.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));









    }
}
