package MangTrongJava;

import java.util.Scanner;

public class TongMotCotTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] myArray;
        System.out.println("Nhập số hàng của mảng");
        int row =  scanner.nextInt();
        System.out.println("Nhập số cột của mảng");
        int column = scanner.nextInt();
        myArray = new int[row][column];

        for (int i = 0; i < row;i++ ) {
            for (int j = 0;j < column;j++) {
                myArray[i][j] = (int)(Math.random()*100);
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Vị trí cột cần tính tổng :");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row;i++) {
           sum += myArray[i][index];
        }
        System.out.println("tổng giá trị các phần tử cột vị trí "+ index+ " là :"+sum);


    }
}
