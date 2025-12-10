import java.util.Scanner;
public class vowels {

    static String vowelscheck(String x){

        x = x.toLowerCase();

        if(x.equals("a") || x.equals("e") || 
        x.equals("i") || x.equals("o") || x.equals("u")){
            return x + " is a vowel";
    
        } else {
          return x + "is not a vowel";
        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a char: ");

        String input = obj.nextLine();

        String result = vowelscheck(input);

        System.out.println(result);

        obj.close();


    }
    
}
