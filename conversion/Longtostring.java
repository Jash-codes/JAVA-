public class Longtostring {

    public static void main(String[] args) {
        
        long num1 = 123456789L;

        String value = String.valueOf(num1);

        System.out.println(value.getClass() + "," + "\n" + value);
    }
    
}
