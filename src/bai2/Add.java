package bai2;

public class Add {//xóa phần tử khỏi mảng

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = new int[arr.length + 1];
        //phần tử cần thêm
        int number = 8;
        //vị trí muốn thêm vào
        int index = 4;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            }
            if (i == index) {
                newArr[i] = number;
            }
            if (i > index) {
                newArr[i] = arr[i - 1];
            }
        }
    }
}
