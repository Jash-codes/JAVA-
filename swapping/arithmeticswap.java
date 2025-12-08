public class arithmeticswap {

    public static void main(String[] args) {
        
        int n = 6, m = 4;

        System.out.println("Before swapping: " + " n = " + n + "| m = " + m);

        n = n + m; // n = 6 -> n = 6+4 = 10
        m = n - m; // m = 4 -> m = 10 - 4 = 6
        n = n - m; // n = 10 -> n = 10 - 6 = 4

        System.out.println("-----------------------------------");

        System.out.println("after swapping " + " n = " + n + "| m = " + m);

        System.out.println("-----------------------------------");


    }
    
}
