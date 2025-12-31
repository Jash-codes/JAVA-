public class Example3 {

    static int a = m1();

    static{
        System.out.println("This is a static block");
    }

    static int m1(){
        System.out.println("From m1");
        return 10;
    }

    public static void main(String[] args) {
        System.out.println("the value of a is " + a);
    }
    
}

