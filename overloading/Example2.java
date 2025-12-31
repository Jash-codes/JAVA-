public class Example2 {
    public static void main(String[] args) {

        Calculate obj1 = new Calculate();
        int res1 = obj1.multiply(10, 20);
        System.out.println("The product a and b is : " + res1);

        Calculate obj2 = new Calculate();
        double res2 = obj2.multiply(10.0, 20.0);
        System.out.println("The product of a * b is : " + res2);

    }

}

class Calculate {

    public int multiply(int a, int b) {
        int prod = a * b;
        return prod;

    }

    public double multiply(double a, double b) {
        double prod = a * b;
        return prod;

    }

}
