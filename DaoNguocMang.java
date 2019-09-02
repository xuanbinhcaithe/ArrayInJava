package MangTrongJava;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array;
        int soLuong;
        do {
            System.out.println("nhap so luong phan tu trong mang");
            soLuong = scanner.nextInt();
            if (soLuong > 20 ){
                System.out.println("số lượng không được vượt quá 20!");
            }
        } while (soLuong > 20 || soLuong <= 0);

        array = new int[soLuong];
        for (int i = 0; i < array.length ;i++) {
            System.out.print("array["+i+"]: " );
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-30s", "Elements in array: ");
        for (int a :array) {
            System.out.print(a+ "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length/2;i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1] = temp;
        }

        System.out.printf("%-30s","Revest array :");
        for (int i = 0;i < array.length ;i++) {
            System.out.print(array[i] +"\t");
        }


    }
}
