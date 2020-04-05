package Count_sum_Of_digits;

public class CountSumOfDigits {
    public static void main(String[] args) {
        int number_one = 123234;
        int sum_one = 0;
        while (number_one > 0) {
            sum_one = sum_one + number_one % 10;
            number_one = number_one / 10;

        }
        System.out.println("the Sum of the digits is :" + sum_one);
    }
}
