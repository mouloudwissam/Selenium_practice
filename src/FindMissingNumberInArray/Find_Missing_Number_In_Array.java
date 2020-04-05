package FindMissingNumberInArray;

public class Find_Missing_Number_In_Array {
    public static void main(String[] args) {
        // array should not have any duplicate value
        //Array not need to be in sorted order
        //values should be in range.
        int a[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);
        System.out.println(sum2 - sum);
    }

}
