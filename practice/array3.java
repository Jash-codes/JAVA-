public class array3 {

    public static void main(String[] args) {
        
        int [] myarr = {10,20,30,40,50};

        for (int i = 0; i < myarr.length;i++){

            // myarr[i] = myarr[i] + 5;
            myarr[i] += 5;
            System.out.println("The index " + i + " has value " + myarr[i]);
        }
    }
    
}
