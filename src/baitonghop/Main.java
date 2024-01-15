package baitonghop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {//bài tập ứng dụng quản lí công việc
    static String[] listTask=new String[0];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Hãy nhập lựa chọn:\n" +
                    "1.hiển thị danh sách công việc\n" +
                    "2.thêm mới việc cần làm\n" +
                    "3.sửa nội dung công việc\n" +
                    "4.Xóa việc đã hoàn thành\n" +
                    "5.Xóa việc đã hoàn thành\n" +
                    "6.thoát chương trình");
            int choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    display();
                    break;
                case 2:
                    System.out.println("nhập công việc cần làm");

                    String newTask = sc.nextLine();
                    listTask=addElement(listTask,newTask);

                    break;
                case 3:

                    System.out.println("vị trí việc cần sửa");
                    int editIndex=Integer.parseInt(sc.nextLine());
                    System.out.println("nhập công việc mới");
                    String editTask=sc.nextLine();
                    listTask[editIndex-1]=editTask;

                    break;
                case 4:
                    System.out.println("nhập vị trí việc cần Xóa");
                    int number=Integer.parseInt(sc.nextLine());
                    listTask=removeElement(listTask,number);
                    break;
                case 5:

                case 6:
                    System.exit(0);
                default:
                    System.out.println("nhập sai lựa chọn");
            }
        }

        //
    }
    //phương thức thêm công việc
    public static String[] addElement(String[]array,String number){
        String[] newArray= new String[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        newArray[newArray.length-1]=number;
        return newArray;
    }
    //2.xóa một phần tử tại một vị trí chỉ định
    public static String[] removeElement(String[]array,int index){
        String[] newArr=new String[array.length-1];
        for (int i = 0; i < array.length; i++) {
            if(i<index){
                newArr[i]=array[i];
            }
            if (i>index){
                newArr[i-1]=array[i];
            }
        }
        return newArr;
    }
    public static void display(){

        if (listTask.length==0){
            System.out.println("chưa có danh sách công việc");
        }else{
            System.out.println("-----Danh sách công việc-----");
            for (int i = 0; i < listTask.length; i++) {
                System.out.printf("%s . %s\n",i+1,listTask[i]);
            }
        }
    }

}
