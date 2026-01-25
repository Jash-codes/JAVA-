public class ex2 {

    public static void main(String[] args) {
        
        int [] arr = new int[5];

        int [] arr2 = {9,8,7,6,5};

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int n = arr.length;
        System.out.println(n);


        for (int s : arr){
            System.out.print(s);
        }

        System.out.println();

        System.out.println("---------------");

        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    
}
