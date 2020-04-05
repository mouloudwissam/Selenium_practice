package DuplicateElementInArray;

public class Duplicate_Element_In_Array_Example_One {
    public static void main(String[] args) {
        String Cars[] = {"BMW", "Toyota", "Honda", "BMW"};
        boolean flag = false;
        for (int i = 0; i < Cars.length; i++) {
            for (int j = i + 1; j < Cars.length; j++) {
                if (Cars[i] == Cars[j]) {
                    System.out.println("the duplicate element" + "" + Cars[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("The Duplicate Is Not Found");

        }
    }
}