public class Example1 {

    public static void main(String[] args) {
        
        Calculate obj1 = new Calculate();
        int res1 = obj1.multiply(10, 20);
        System.out.println("The product a and b is : " + res1);

        Calculate obj2 = new Calculate();
        int res2 = obj2.multiply(10, 20, 30);
        System.out.println("The product of a * b * c is : " + res2);
        
    }

}

class Calculate {

    public int multiply(int a, int b) {
        int prod = a * b;
        return prod;

    }

    public int multiply(int a, int b, int c) {
        int prod = a * b * c;
        return prod;

    }

}
