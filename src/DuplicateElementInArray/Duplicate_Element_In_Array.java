package DuplicateElementInArray;

public class Duplicate_Element_In_Array {
    public static void main(String[] args){
        String name[]={"java","Books","NameOftheClass","kamal","java"};
        boolean flag=false;
        for(int i=0;i<name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i]==name[j]){
                    System.out.print("Print the Duplicate element:"+name[i]);
                    flag=true;
                }
            }
        }
        if(flag ==false){
            System.out.println("the duplicate elements is not found:");

        }
    }
}
