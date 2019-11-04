package Reversing_String;

public class String_RversEample2 {
    public static void main(String[] args) {
        String name = "my name is mouloud  iam from morocco";
        String rvers = "";
        StringBuffer buffer = new StringBuffer(name);
        buffer.reverse();
        System.out.println(" the reverse sentence:" + buffer);
        System.out.println("****************");
        //By using the Character Array
        char[] u = name.toCharArray();
        int babe = name.length();
        for (int i = babe - 1; i >= 0; i--) {
            rvers = rvers + u[i];
            System.out.println(rvers);
        }

    }
}
