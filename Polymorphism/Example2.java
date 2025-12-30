public class Example2 { // COMPILE TIME - METHOD OVERLOADING

    public static void main(String[] args) {

        System.out.println("The Integer result is: " + Calculator.Multiply(5,6));
        System.out.println("The Double result is: " + Calculator.Multiply(2.55, 5.65));
        
    }
    
}


class Calculator{

    static int Multiply(int a, int b){
        return  a * b;
    }
    
    static double Multiply(double a, double b){
        return a * b;
        
    }
}