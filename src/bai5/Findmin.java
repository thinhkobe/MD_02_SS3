package bai5;

import java.util.Scanner;

public class Findmin {//tìm số nhỏ nhất

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số phần tử mảng muốn tạo");
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ "+i);
            array[i]=sc.nextInt();
        }
        findmin(array);
    }
    public static void findmin(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("số nhỏ nhất là"+min);
    }
}
