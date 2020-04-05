package SearchLinerElements;

public class Liner_Search_Example_two {
    public static void main(String[] args) {
        int name[] = {2, 23, 54, 76, 898, 123, 4};
        int last_Number = 89;
        boolean flag = false;
        for (int i = 0; i < name.length; i++) {
            if (last_Number == name[i]) {
                System.out.println("the element found" + " " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("The element is Not found");
        }

    }
}

