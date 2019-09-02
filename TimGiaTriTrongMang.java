package MangTrongJava;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String[] students= {"Christian","Michael","Camila","Sienna","Tanya","Connor","Zacharial","Mallory","Zoe","Emily"};
        System.out.println("Enter a name's student:");
        String student_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0;i < students.length ;i++) {
            if (students[i].equals(student_name)) {
                System.out.println("Position of the students in the list "+ student_name +" is :"+(i+1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + student_name + "in the list");
        }

    }
}



