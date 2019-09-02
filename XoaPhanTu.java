package MangTrongJava;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {12,4,5,8,3,1,7,2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number = scanner.nextInt();
        boolean check = false;
        int index = -1;
        for (int  i = 0; i < array.length; i++) {
            if (number == array[i]) {
                check = true;
                index = i;
                break;
            }
        }
         if (check) {
             System.out.println(number + " có trong mảng tại vị trị index "+ index);
         }else {
             System.out.println(number+ " không có trong mảng");
         }

         if (index != -1) {
             int[] newArray = new int[array.length - 1];
             for (int i = 0; i <= index - 1; i++) {
                 newArray[i] = array[i];
             }
             for (int i = index; i < newArray.length; i++) {
                 newArray[i] = array[i + 1];
             }

             System.out.println("mảng sau khi xóa phần tử " + number + " trở thành :");
             for (int i = 0; i < newArray.length; i++) {
                 System.out.print(newArray[i] + "\t");
             }
         }


    }
}