package SumOfArray;

public class Sum_of_Array_Example {
    public static void main(String[] args) {
        int v[] = {12, 23, 45, 1, 23, 86, 5, 67};
        int sun_one = 0;
        for (int i = 0; i < v.length - 1; i++) {
            sun_one = sun_one + v[i];

        }
        System.out.println("the sume of the Array :"+sun_one);
    }
}
