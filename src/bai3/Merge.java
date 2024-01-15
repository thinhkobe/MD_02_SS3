package bai3;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,8,9};

        int[] newArr=merge(arr1,arr2);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] merge(int[]arr1,int[]arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i]=arr2[i];

        }
        return newArr;
    }
}
