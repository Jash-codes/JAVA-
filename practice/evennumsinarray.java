public class evennumsinarray {

    public static void main(String[] args) {
        
        int [] myarr = {23,56,12,89,32,51};

        int sumeven = 0;

        for (int i = 0; i < myarr.length;i++){

            if (myarr[i] % 2 == 0){
                sumeven += myarr[i];
                System.out.println(myarr[i] + " is even");
            }
        
        }

        System.out.println("the sum of even numbers is " + sumeven);
    }
    
}
