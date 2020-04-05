package Count_sum_Of_digits;

public class The_sum {
    public static void main(String[] args){
        int x=123456;
        int y=0;
        while(x>0){
            y=y+x%10;
            x=x/10;
        }
        System.out.println(y);

    }
}
