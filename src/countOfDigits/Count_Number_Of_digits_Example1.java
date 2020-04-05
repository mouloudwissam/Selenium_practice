package countOfDigits;

public class Count_Number_Of_digits_Example1 {
    public static void main(String[] args){
        int num=1098567345;
        int coun=0;
        while(num>0){
            num=num/10;
            coun++;

        }
        System.out.println("the number of the digits is :"+coun);
    }
}
