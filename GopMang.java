package MangTrongJava;

public class GopMang {
    public static void main(String[] args) {
        int[]array1 = {1,2,3,9,12};
        int[]array2 = {5,6,7,4,8};
        int[]array3 = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length;i++) {
            array3[i] = array1[i];
        }
        for (int i = 0;i < array2.length;i++) {
            array3[array1.length+i] = array2[i];
        }
        System.out.println("Các phần tử trong mang thứ 3 là :");
        for (int i = 0;i < array3.length;i++) {
            System.out.print(array3[i]+"\t");
        }


    }


}
