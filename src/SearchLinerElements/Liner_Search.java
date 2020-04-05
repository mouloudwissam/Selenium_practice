package SearchLinerElements;

public class Liner_Search {
    public static void main(String[] args) {
        int a[] = {12, 13, 16, 33, 84, 12};
        int search = 13;
         boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                System.out.println("The elements is found" + "" + i);
                 flag = true;
            }
        }
         if (flag == false) {
        System.out.println("The Elements is Not Found");
    }
}
}
