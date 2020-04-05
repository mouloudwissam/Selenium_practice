package countOfDigits;

public class Count_Number_of_digits_example2 {
    public static void main(String[] args) {
        int mouloud = 98964622;
        int jamal = 0;
        while (mouloud > 0) {
            mouloud = mouloud / 10;
            jamal++;
        }
        System.out.println("the count of digits:" + jamal);

    }
}
