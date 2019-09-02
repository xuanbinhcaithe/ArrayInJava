package MangTrongJava;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int[] arrayA = new  int[8];
        System.out.println("nhap gia tri cua maang tren");
        for (int i = 0;i < arrayA.length; i++) {
            System.out.println("arrA["+i+"] :");
            arrayA[i] = scanner.nextInt();
        }
        System.out.println("Danh sach phan tu cua mang A la :");
        for (int i = 0;i < arrayA.length;i++) {
            System.out.print(arrayA[i] +"\t");
        }
        System.out.println("Nhap gia tri can chen vao");
        int value = scanner.nextInt();
        System.out.println("Nhap vi tri can chen vao");
        int index = scanner.nextInt();
        try {
            int[] arrayB = createNewArr(arrayA,value,index);
            for (int i = 0;i < arrayB.length;i++) {
                System.out.print(arrayB[i] +"\t");
            }
        }catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("index nhap vao khong hop le");
        }



    }

    public static int[] createNewArr(int[]arr,int value, int index) {
        int[] arrayB = new int[arr.length+1];
        for (int i = 0;i<arr.length;i++) {
            arrayB[i] = arr[i];
        }
        for (int j = (arrayB.length-1);j>0;j--) {
            arrayB[j] = arrayB[j-1];
            if (j == index) {
                break;
            }
        }
        arrayB[index-1] = value;
        return arrayB;
    }
}