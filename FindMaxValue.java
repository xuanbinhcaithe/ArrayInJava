package MangTrongJava;


public class FindMaxValue {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[] array;
        int size ;
        do {
            System.out.println("Enter a size :");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("The size should not exceed 20!");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("The element " + (i + 1) + " is :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list :");
        for (int j = 0; j <  array.length;j++) {
            System.out.print(array[j] + "\t");
        }

        int maxVlue = array[0];
        int index = 1;
        for (int j = 0; j < array.length;j++) {
            if (array[j] > maxVlue) {
                maxVlue = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property in the list is :" + maxVlue + ",at position :"+ index);

    }


}
