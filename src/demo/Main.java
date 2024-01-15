package demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array mảng không thể thay đổi số lượng phần tử
        //mảng không hỗ trợ các phương thức làm việc với mảng
        //khi khởi tạo mà chưa gán giá trị thì các phần tử trong mảng sẽ mang giá trị default

        //khai báo mảng
        int[] arrName = {1, 2, 3, 4, 5, 6};
        String[] arrayString={"hung","duc","minh"};
        String[] newArray=arrayString.clone();//sao chép mảng
        //tính tổng
        Arrays.stream(arrName).sum();

        //mảng 2 chiều
        int[][] array2= {{1,2},{1,3},{2,4}};
        //truy xuất phần tử đầu tiên của mảng
        System.out.println(array2[0][0]);;//trong đó i là vị trí ở mảng ngoài j là vị trí mảng bên trong
        //cách 2 dùng vòng lặp for

        //cách 3
        Arrays.stream(arrayString).forEach((element)->{
            System.out.println(element.length());
        });

        //duyệt mảng 2 chiều
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

            }
        }
        //phương thức là tập hợp một nhóm các câu lệnh sử lí một chức năng nhất định
        //cách để khai báo một phương thức
    }


}
