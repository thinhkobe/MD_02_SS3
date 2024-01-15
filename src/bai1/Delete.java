package bai1;

public class Delete {//xóa phần tử khỏi mảng

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //vị trí cần xóa
        int index=2;
        int[] newArr=new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(i<index){
                newArr[i]=arr[i];
            } else  {
                newArr[i-1]=arr[i];
            }
        }
    }
}
