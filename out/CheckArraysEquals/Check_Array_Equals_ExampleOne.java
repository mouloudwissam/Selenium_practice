package CheckArraysEquals;

import java.util.Arrays;

public class Check_Array_Equals_ExampleOne {
    public static void main(String[] args) {
        int s[] = {2, 2, 35, 6, 7, 9};
        int ss[] = {2, 3, 3, 4, 0, 6, 8};
        boolean statues = Arrays.equals(s, ss);
        if (statues == true) {
            System.out.println("The Arrays are Equals:");
        } else {
            System.out.println("The Arrays are Not Equals:");
        }

    }
}
