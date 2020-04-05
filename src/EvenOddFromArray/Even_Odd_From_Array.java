package EvenOddFromArray;

public class Even_Odd_From_Array {
    public static void main(String[] args){
        int a[]={1,2,4,6,4,8,9,3,2};
        System.out.println("The Even Number:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                System.out.print(a[i]);
        }
        System.out.println("The Odd Number:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
                System.out.print(a[i]);
        }
    }
}
