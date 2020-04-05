package CheckArraysEquals;

import java.util.Arrays;

public class Check_Array_Equals {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        boolean status = Arrays.equals(a1, a2);
        if (status == true) {
            System.out.println("Array are Equal");
        } else {
            System.out.println("Array are NOT Equal");
        }

    }
}
