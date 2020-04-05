package CountEvenAndOddDigits;

public class Count_Even_Add_Odd_Digits_Example1 {
    public static void main(String[] args) {
        int number = 1234123;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;

        }
        System.out.println("the sum of integer:" + sum);
    }

}
