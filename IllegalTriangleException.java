package MangTrongJava;
import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        int a = scanner.nextInt();
        System.out.println("b : ");
        int b = scanner.nextInt();
        System.out.println("c : ");
        int c = scanner.nextInt();
        try {
            check(a,b,c);

        }catch (IllegalTriangleException e) {
            System.out.println("không đúng rồi !");
        }


    }
    public static void check(int a,int b ,int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a+b) < c || (a+c)<b || (b+c) < a) {
            throw new IllegalTriangleException();
        }else {
            System.out.println("đây là 3 cạnh của tam giác");
        }
    }

}

