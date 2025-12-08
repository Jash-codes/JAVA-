public class variableswap {

    public static void main(String[] args) {
        
        int n = 6, m = 4;

        System.out.println("Before swapping: " + " n = " + n + "| m = " + m);

        int temp = n;
        n = m;
        m = temp;

        System.out.println("-----------------------------------");

        System.out.println("after swapping " + " m = " + m + "| n = " + n);

        System.out.println("-----------------------------------");
      }
    
}
