package CountEvenAndOddDigits;

public class Count_Even_Add_Odd_Digits {
    public static void main(String[] agrs) {


        int numbe = 12345673;
        int even_number = 0;
        int odd_number = 0;
        while (numbe > 0) {
            int rem = numbe % 10;
            if (rem % 2 == 0) {
                even_number++;
            } else {
                odd_number++;
            }
            numbe = numbe / 10;
        }
        System.out.println("the even number:" + even_number);
        System.out.println("the  add number:" +odd_number);
    }
}
