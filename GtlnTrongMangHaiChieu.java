package MangTrongJava;

import java.util.Random;
import java.util.Scanner;

public class GtlnTrongMangHaiChieu {
    public static void main(String[] args) {
        double[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran");
        int row = scanner.nextInt();

        System.out.println("nhap so cot cua ma tran");
        int column = scanner.nextInt();

        array = createArray(row,column);
        disPlay(array);
        findMax(array);

    }


    public static double[][] createArray(int row, int column) {
        Random rd = new Random();
        double[][]array = new double[row][column];
        for (int i = 0 ; i < array.length;i++) {
            for (int j = 0 ; j < array[i].length;j++) {
                array[i][j] = rd.nextDouble();
            }
        }
        return array;
    }


    public static void disPlay(double[][]arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0;j < arr[i].length ;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findMax(double[][]arr) {
        double maxValue = arr[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length;j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("giá trị lớn nhất trong ma trận trên là :"+ arr[row][column] + " tại vị hàng: "+ (row+1) + ",cột: "+ (column+1));
    }

}
