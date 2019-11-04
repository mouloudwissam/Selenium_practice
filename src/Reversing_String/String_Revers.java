package Reversing_String;

public class String_Revers {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        String rev = "";
        //By using Character Array
        char[] a = str.toCharArray();
        int len = a.length;
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + a[i];
            System.out.println("the reverse value:" + rev);
        }
// By using StringBuffer class
        StringBuffer string = new StringBuffer(str);

        System.out.println(string.reverse());
        // By using Character Array
        char[] b = str.toCharArray();
        for (int c = 0; c < b.length; c++) {

            System.out.println(b[c]);
        }

    }

}

