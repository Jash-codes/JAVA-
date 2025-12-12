import java.util.Scanner;

public class rectarea {

    static Integer areaofrec (int W, int L){

        int area_of_rectangle = W * L;
        return area_of_rectangle;

    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the width of rectangle: ");
        int width = obj.nextInt();

        System.out.print("Enter the length of the rectangle: ");
        int length = obj.nextInt();

        int area = areaofrec(width, length);

        System.out.println("The area of the rectangle is: " + area);

        obj.close();

    }
    
}
