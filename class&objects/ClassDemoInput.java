import java.util.Scanner;

class students{

    int id;
    String name;
}

public class ClassDemoInput {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        students s1 = new students();
        System.out.print("Enter ID of student 1: ");
        s1.id = obj.nextInt();

        obj.nextLine();

        System.out.print("Enter the name of student 1: ");
        s1.name = obj.nextLine();

        System.out.println("\n The ID is " + s1.id + "\n The name is : " + s1.name);

        obj.close();
        
    }
    
}
