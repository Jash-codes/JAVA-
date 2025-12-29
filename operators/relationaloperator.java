public class relationaloperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String greater = (a > b) ? "a is greater" : "a is not greater";
        System.out.println(greater);

        String lesser = (a < b) ? "a is lesser" : "a is not lesser";
        System.out.println(lesser);

        String equalto = (a == 10) ? "true" : "false";
        System.out.println(equalto);

        String notequalto = (a != b) ? "true" : "false";
        System.out.println(notequalto);

        String greater_than_orequalto = (a >= 20) ? "true" : "false";
        System.out.println(greater_than_orequalto);

        String lesser_than_orequalto = (a <= b) ? "true" : "false";
        System.out.println(lesser_than_orequalto);
    }

}
