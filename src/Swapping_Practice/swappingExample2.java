package Swapping_Practice;

public class swappingExample2 {
    public static void main(String[] args) {
        int w = 31;
        int m = 33;
        System.out.println("Before the swapping:" + w + " " + m);
        // using single statement
        //m = w + m - (w = m);
        /* System.out.println("After swapping:" + w + " " + m);


        //using the third variable
        int t = w;
        w = m;
        m = t;
        System.out.println("After the swapping:" + w + " " + m);


        // using + & -
        w = w + m;
        m = w - m;
        w = w - m;
        //System.out.println("After the swapping:" + w + " " + m);
        // using * & / but numbers should not be equal zero
        w=w*m;
        m=w/m;
        w=w/m;
        System.out.println("After the swapping:" + w + " " + m);

         */
        // using bitwise
        w = w ^ m;
        m = w ^ m;
        w = w ^ m;
        System.out.println("After the swapping:" + w + " " + m);

    }
}
