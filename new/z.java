import java.util.Scanner;

public class z {

    public static void main(String[]args){

        Scanner name = new Scanner(System.in);

        System.out.print("Enter name : ");

        String input = name.nextLine();

        System.err.println("Input entered : " + input);

        name.close();

    }
    
}
