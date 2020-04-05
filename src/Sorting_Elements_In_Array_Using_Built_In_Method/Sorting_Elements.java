package Sorting_Elements_In_Array_Using_Built_In_Method;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_Elements {
    public static void main(String[] args) {
        int a[] = {12, 13, 54, 23, 6, 34, 45};
        System.out.println("Array Elements Before sorting" + "" + Arrays.toString(a));
       Arrays.parallelSort(a);
        System.out.println("Array Elements After sorting" + "" + Arrays.toString(a));








        //or you can use this Method.
        Arrays.sort(a);
        System.out.println("Array Elements After sorting" + "" + Arrays.toString(a));
        // decending order
        Integer b[]={12,43,67,145,34,87};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("Array Elements After sorting" + "" + Arrays.toString(b));
    }


}
