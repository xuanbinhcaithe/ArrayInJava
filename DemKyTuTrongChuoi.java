package MangTrongJava;

import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần kiểm tra ");
       char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("có "+ count+" ký tự "+character+" trong chuỗi trên");

    }
}
