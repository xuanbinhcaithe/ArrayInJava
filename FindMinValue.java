package MangTrongJava;

public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {8,5,6,1,3,4};
        int index = min(array);
        System.out.println("Min value is "+ array[index] +",at position :"+ (index+1));


    }
    public static int min(int[]arr) {
        int minValue = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }
}