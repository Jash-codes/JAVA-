public class logicaloperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Using AND operator

        if (b % a == 0 && a + b == 30) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // using OR operator
        if (a % b == 0 || a + b == 30) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }

        // using NOT Equal to

        if (a != b) {
            System.out.println("Not equal");
        } else {
            System.out.println("Equal");
        }

    }

}
