import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class buff {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter your name: ");
        String name = reader.readLine();

        System.out.print("enter your age: ");
        String ageage = reader.readLine();
        int age = Integer.parseInt(ageage);
        
        System.out.println("-----------------------");
        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        System.out.println("-----------------------");
    }
    
}
