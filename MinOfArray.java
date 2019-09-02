package MangTrongJava;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array;
        int size;
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 15) {
                System.out.println("Size should not exceed 15!");
            }
        }while (size>15);
         array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("arr["+i+"] is: ");
            array[i] =  scanner.nextInt();
        }
        System.out.print(" Values of array are :");
        int min = array[0];
        int index = 0;
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i]+"\t");
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Min of array is: "+ min+ " tại index :" + index);



    }
}
