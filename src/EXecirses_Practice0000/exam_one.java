package EXecirses_Practice0000;

import java.util.Scanner;

public class exam_one {
    // Reverse the String name = " the best is to practice every day the home works"
    public static void main(String[] args) {
        //By using StringBuffer
        String name = "the best is to practice every day the home works";
        StringBuffer string = new StringBuffer(name);
        StringBuffer name_of_the_Example = string.reverse();
        System.out.println(" the reverse name is : " + name_of_the_Example);


        //    swapping those int a =20;int b=45;
        // by using the third variable:
        int a = 20;
        int b = 45;
        System.out.println(" Before Swapping:" + a + " " + b);
        int t = a;
        a = b;
        b = a;
        System.out.println(" After Swapping:" + a + " " + b);
        // Reverse the int name2=12345;
        // By using String buffer
        Scanner scanner = new Scanner(System.in);
        System.out.println("the value");
        int number = scanner.nextInt();
        int orgin_number = number;
        StringBuffer bf = new StringBuffer(String.valueOf(number));
        StringBuffer reve = bf.reverse();
        System.out.println(" the value resersed:" + reve);

        if (orgin_number == number) {
            System.out.println(orgin_number + " is palindrome number");
        } else {
            System.out.println(orgin_number + "  is not palindrome number");
        }

    }


}
