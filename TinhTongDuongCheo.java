package MangTrongJava;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột của ma trận vuông");
        int row = scanner.nextInt();
        int [][] maTran = new int[row][row];
        for (int i = 0;i < maTran.length; i++) {
            for (int j = 0;j < maTran.length;j++) {
                maTran[i][j] = (int)(Math.random()*100);
                System.out.print(maTran[i][j]+"\t");
            }
            System.out.println();
        }

        int sum =0;
        for (int i = 0; i < maTran.length;i++ ) {
            sum += maTran[i][i];
        }
        System.out.println("tông đường chéo thứ nhât "+ sum);

        int sum2 = 0;
        for (int i = 0,j = (maTran.length-1); i < maTran.length; i++,j--) {
            sum2 +=  maTran[i][j];
        }
        System.out.println("Tồng đường chéo thứ hai là "+sum2);

    }
}
