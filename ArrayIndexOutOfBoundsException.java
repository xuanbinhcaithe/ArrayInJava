package MangTrongJava;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] myArray = createArray();
        for (int i = 0; i < myArray.length;i++) {
            System.out.print(myArray[i] +"\t");
        }
        System.out.println();
        Scanner scanner =  new Scanner(System.in);
        while (true) {
            System.out.println("nhap vao vi tri can hien thi");
            int index = scanner.nextInt();
            try {
                System.out.println(myArray[index]);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.err.println("vi tri khong nam trong vung cho phep");
            }
        }
    }
    public static int[] createArray() {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0;i < arr.length;i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}