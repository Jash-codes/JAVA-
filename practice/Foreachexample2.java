public class Foreachexample2 {

    public static void main(String[] args) {
        
        int [] myarr = {1,2,3,4,5};

        System.out.println("USING FOR LOOP");

        for (int i = 0; i < myarr.length;i++){
            System.out.println("The nums are : " + myarr[i]);
        }

        System.out.println(" ");


        System.out.println("USING FOR EACH LOOP");
        for (int nums : myarr){
            System.out.println("The nums are: " + nums);
        }
    }
    
}
