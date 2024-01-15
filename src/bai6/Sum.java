package bai6;

import bai4.Findmax;

import java.util.Scanner;

public class Sum {//tính tổng mảng đa chiều
    public static void main(String[] args) {
       int[][]matrix= Findmax.setMatrix();
        System.out.println("Nhập mảng cần tính tổng");
       int index=new Scanner(System.in).nextInt();
       sumMatrix(matrix,index);
    }
    public static int sumMatrix(int[][]arr,int index){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
           total+=arr[i][index];
        }
        System.out.println("tổng là :"+total);
        return total;
    }
}
