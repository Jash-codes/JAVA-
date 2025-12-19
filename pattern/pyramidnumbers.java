public class pyramidnumbers {


    public static void pyramid(int n){

        int x ;

        for(int i = 1; i <= n; i++){
            x = i - 1;

            for(int j = i; j <= n - 1;j++){
                System.out.print("!");
                System.out.print("!!");
                
            }

            for (int j = 0;j <= x;j++)
                System.out.print((i + j) < 10 ? (i + j) + "  " : (i + j) + " ");          
              

            for (int j = 1;j <= x;j++)
                System.out.print((i + x - j) < 10 ? (i + x - j) + "  " : (i + x - j) + " ");

            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        
        int num = 5;
        pyramid(num);
    }
    
}
