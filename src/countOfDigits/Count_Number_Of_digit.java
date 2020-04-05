package countOfDigits;

public class Count_Number_Of_digit {
    public static void main(String[]agrs){
        int number=12345673;
        int count=0;
        while(number>0){
            number=number/10;
            count++;

        }
        System.out.println("Number of didgit is :"+count);
    }
}
