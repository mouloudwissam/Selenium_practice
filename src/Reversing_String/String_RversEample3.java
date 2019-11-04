package Reversing_String;

public class String_RversEample3 {
    public static void main(String[] args) {
        String name1 = " my frist vacation it was in morocco , then the second one i went tp paris after that ";
        String empty = "";
        char[] nine = name1.toCharArray();
        int len1 = name1.length();
        for (int i = len1 - 1; i >= 0; i--) {
            empty = empty + nine[i];
            System.out.println(empty);
            System.out.println(name1);

        }
        StringBuffer bu = new StringBuffer(name1);
        System.out.println("PLEASE PRINT THE REVERSE OF THE SENTENCE:" + bu.reverse());

    }
}
