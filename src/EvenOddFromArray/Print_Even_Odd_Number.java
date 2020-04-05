package EvenOddFromArray;

public class Print_Even_Odd_Number {
    public static void main(String[] args) {
        int[] v = {1, 3, 7, 6, 4, 2, 5, 9, 13, 645, 123};
        System.out.print("The Even Number:");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0)
                System.out.print(v[i]);
        }
        System.out.println("the Odd Number:");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0)
                System.out.print(v[i]);
        }
    }
}
