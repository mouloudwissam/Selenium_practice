package LargestOfThreeNumbers;

import java.util.Scanner;

public class LargesOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = scanner1.nextInt();
// By using logic.
        System.out.println("Enter the second Number:");
        int b = scanner1.nextInt();

        System.out.println("Enter the third Number:");
        int c = scanner1.nextInt();
        if (a > b && a > c) {
            System.out.println(a + "A is the largest Number");
        } else if (b > a && b > c) {
            System.out.println(b + "B is the largest Number");
        } else if (c > a && c > b) {
            System.out.println(c + "is the largest Number");
        }

    }
}