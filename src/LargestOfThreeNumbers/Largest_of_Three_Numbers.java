package LargestOfThreeNumbers;

import java.util.Scanner;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = scanner1.nextInt();

        // By using logic.
        System.out.println("Enter the second Number:");
        int b = scanner1.nextInt();

        System.out.println("Enter the third Number:");
        int c = scanner1.nextInt();
        int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println("the largest number is :" + largest);

        if (a > b && a > c) {
            System.out.println("A is the largest Number");
        } else if (b > a && b > c) {
            System.out.println("B is the largest Number");
        } else if (c > a && c > b) {
            System.out.println("is the largest Number");
        }
    }
}
