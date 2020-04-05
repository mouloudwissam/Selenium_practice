package RemoveWhiteSpacesInString;

public class Remove_white_spaces_IN_String {
    public static void main(String[] args) {
        String name_space = "this is my name and i wish i can live in big city";
        name_space = name_space.replaceAll("\\s", "");
        System.out.println(name_space);

    }
}
