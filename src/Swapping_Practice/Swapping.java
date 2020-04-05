package Swapping_Practice;

public class Swapping {
    // the first logic we can use third variable
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        /*logic 1:System.out.println(" before swaping :" + a + " " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping:" + a + " " + b);


        // logic 2:without using third variable by using  - & +
        a = a + b;
        b = a - b;
        a = a - b;
       // a = a - b;
        System.out.println("after swapping:" + a + " " + b);


        // logic 3:with using logic * & / should not be zero
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("after swaping :" + a + " " + b);


        // logic 4: by using bitwise
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swaping:" + a + " " + b);

         */
        // logic 5 : single statement
        b = a + b - (a = b);
        System.out.println("after swapping:" + a + " " + b);

    }

}
