public class example1 {

    public static void main(String[] args) {

        // int [] myarr = new int[10];

        // System.out.println(myarr.length);

        // for (int i = 0;i < 10; i++){
        // myarr[i] = i + 10;
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.println(myarr[i]);

        // }

        // myarr[4] = 100;
        // System.out.println(myarr[4]);

        int[] marks = { 100, 40, 20, 50, 90 };

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // for (int i : marks)
        //     System.out.println(i);

        System.out.println("printing the array in reverse order ");
        System.out.println("--------------------------------------");

        for(int i = marks.length -1; i >= 0; i--){
            System.out.println(marks[i]);
        }
        
    }

}
