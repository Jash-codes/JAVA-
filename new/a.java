public class a {

    public static void main(String[] args) {
        
        int a = 15;
        int b = 10;

        System.out.println("a : " + a + " b : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + " b : " + b);
    }
    
}
