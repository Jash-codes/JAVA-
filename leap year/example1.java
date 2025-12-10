import java.util.Scanner;

class example1 {

    static void isleapyear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int YEAR = obj.nextInt();

        isleapyear(YEAR);

        obj.close();
    }
}