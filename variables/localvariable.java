public class localvariable {

    public static void main(String[] args) {
        
        int x =10;

        String name = "jash";

        if (x >= 10){
            System.out.println("x is: " + x);
        } else{
            System.out.println("nope");
        }

        
        for (int i = 0; i <= 2; i++){
            String loopname = name +" " + i;
            System.out.println(loopname);
        }
    }
    
    
}
