package bai7;

import bai4.Findmax;

public class Sumalpha {
    public static void main(String[] args) {
        //tạo ma trận số
       int[][] matrix= Findmax.setMatrix();
        System.out.println(sumAlpha(matrix));


    }
    public static int sumAlpha(int[][]arr){
        //tạo 1 biến bằng độ dài cạnh
        int size=arr.length;
        //biến tổng của đường chéo
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                    total+=arr[i][j];
                }
                if(i+j==size-1&&i!=j){
                    total+=arr[i][j];
                }
            }
        }
        return total;
    }
}
