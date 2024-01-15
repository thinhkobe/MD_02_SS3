package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class Findmax {
    public static void main(String[] args) {
        int[][] matrix=setMatrix();
        findmax(matrix);
    }
    //tạo phương thức tìm số lớn nhất

    public static void findmax(int[][] arr) {
        int maxValue = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }
        System.out.println("giá trị lớn nhất là :" + maxValue);
        System.out.println("vị trí tìm thấy: Mảng thứ " + a + "phần tử thứ " + b);

    }
    public static int[][] setMatrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số mảng  trong matrix");
        int totalArray=sc.nextInt();
        System.out.println("nhập số phần tử trong 1 mảng");
        int totalElement=sc.nextInt();
        int [][] matrix=new int[totalArray][totalElement];
        for (int i = 0; i < totalArray; i++) {
            for (int j = 0; j < totalElement; j++) {
                System.out.println("nhập số thứ"+(j+1)+ " ở mảng"+(i+1));
                int input=sc.nextInt();
                matrix[i][j]=input;
            }
        }
        System.out.println("mảng đã nhập :"+Arrays.deepToString(matrix));
        return matrix;
    }

}
