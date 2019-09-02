package MangTrongJava;

import java.util.Scanner;

public class SoLuogSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30!");
            }
        }while (size > 30);
        array = new int[size];
        System.out.println("enter a mark for student");
        for (int i = 0; i < array.length ; i++) {
            System.out.print("mark of student "+(i+1)+" is: ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = 0;j < array.length;j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >=5 && array[j]<=10) {
                count++;
            }
        }
        System.out.println("\n The number of student passing the exam is "+count);


    }
}
