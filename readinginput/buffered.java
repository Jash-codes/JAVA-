import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffered {

    public static void main(String[] args) throws IOException {

        // @SuppressWarnings("resource")
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");

        int num = Integer.parseInt(reader.readLine());
        System.out.println("the number entered is: " + num);

    }
    
}
