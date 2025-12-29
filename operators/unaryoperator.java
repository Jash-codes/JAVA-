public class unaryoperator {

    public static void main(String[] args) {

        //INCREMENT
        int a = 10;
        int n0 = a++; //post increment method
        System.out.println(a);
        System.out.println(n0);

        System.out.println("----------");

        int b = 12;
        int n1 = ++b; // pre increment method
        System.out.println(b);
        System.out.println(n1);
        System.out.println();


        //DECREMENT
        int x = 5;
        int y = 6;

        int n2 = --x; // pre-decrement
        System.out.println(x);
        System.out.println(n2);
        System.out.println("----------");

        int n3 = y--; //post - decrement
        System.out.println(y);
        System.out.println(n3);
    }
    
}
