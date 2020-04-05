package RemoveJunk;

public class Remove_Junks {
    public static void main(String[] args) {
        //By using regular Expression:

        String name = "12132446 waeratsdhfdjkfkfjcj #$%&*(()";
        name = name.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(name);

    }

}
