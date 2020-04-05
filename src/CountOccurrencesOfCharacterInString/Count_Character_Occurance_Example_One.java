package CountOccurrencesOfCharacterInString;

public class Count_Character_Occurance_Example_One {
    public static void main(String[] args) {
        String last_Goal = " I scord the last call this year";
        last_Goal = last_Goal.replaceAll("\\s", "");
        System.out.println(last_Goal);
        int one = last_Goal.length();
        int two = last_Goal.replace("t", "").length();
        int count_Number = one - two;
        System.out.println(count_Number);
    }
}
