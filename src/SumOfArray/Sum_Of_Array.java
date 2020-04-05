package SumOfArray;

public class Sum_Of_Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 7, 8, 9, 12};
        long sum = 0;
        for (int i = 0; i <= a.length-1; i++) {
            sum = sum + a[i];

        }
        System.out.println("The Sum of array is :" + " " + sum);
    }
}
