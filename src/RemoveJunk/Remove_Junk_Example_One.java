package RemoveJunk;

public class Remove_Junk_Example_One {
    public static void main(String[] args) {
        String last_sentence = "123456789 @#$@@ Is MY NUMBER*&())(&^% and THis )(*#$%^# Where#$@% I livE";
        last_sentence = last_sentence.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(last_sentence);
    }
}
