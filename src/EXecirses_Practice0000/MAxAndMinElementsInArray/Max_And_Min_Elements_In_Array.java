package EXecirses_Practice0000.MAxAndMinElementsInArray;

public class Max_And_Min_Elements_In_Array {
    public static void main(String[] args) {
        int a[] = {12, 34, 67, 12, 97, 13};
        //for maximum
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The Maximum Array is :" + " " + max);
        //for minimum
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("The Minimum Array is: " + min);
    }
}
