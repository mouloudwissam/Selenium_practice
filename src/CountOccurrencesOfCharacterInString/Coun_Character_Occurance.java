package CountOccurrencesOfCharacterInString;

public class Coun_Character_Occurance {
    public static void main(String[] args) {
        String name = "the best place to live in United State Of America is Florida";
        int TotalCount = name.length();
        int Totalcount_AfterRemove = name.replace("U", "").length();
        int count = TotalCount - Totalcount_AfterRemove;
        System.out.println("The Total Count After Remove is :" + count);
    }
}
