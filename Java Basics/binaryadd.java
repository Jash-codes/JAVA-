public class binaryadd {

    static String addbinary(String x, String y){

        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);

        // Decimal system (base 10) → digits 0–9, radix = 10
        // Binary system (base 2) → digits 0,1, radix = 2
        // Octal system (base 8) → digits 0–7, radix = 8
        // Hexadecimal system (base 16) → digits 0–9 and A–F, radix = 16

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        return result;
    }

    public static void main(String[] args) {

        String x = "00110", y = "11010";

        System.out.println(addbinary(x, y));

    }

}
