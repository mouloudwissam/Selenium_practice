package Reversing_Numbers;

import java.util.Scanner;

public class Numbers_Rversing_Example_1 {
    int numbers = 0123457;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the value:");
        int number = scan.nextInt();
        int rve = 0;
        while (number != 0) {
            rve = rve * 10 + number % 10;
            number = number / 10;

        }
        System.out.println("NUMB:" + rve);

    }

    public static void main(System[] args) {
        //by using algoritm
        Scanner sc = new Scanner(System.in);
        System.out.println("enter:");
        int name_nmber = sc.nextInt();
        int n = 0;
        while (name_nmber != 0) {
            n = n * 10 + name_nmber % 10;
            name_nmber = name_nmber / 10;
            System.out.println("reverse enter:");
        }
    }


}
