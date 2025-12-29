
import java.util.Scanner;

public class example1 {

    public static String getdayname(int days) {

        String dayname = null;

        switch (days) {
            case 1:
                dayname = "monday";
                break;
            case 2:
                dayname = "tuesday";
                break;
            case 3:
                dayname = "wednesday";
                break;  
            case 4:
                dayname = "thursday";
                break;
            case 5:
                dayname = "friday";
                break;
            case 6:
                dayname = "saturday";
                break;
            case 7:
                dayname = "sunday";
                break;

        }

        return dayname;

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = obj.nextInt();
        String Dayname = getdayname(day);
        System.out.println("The day is : " + Dayname);

        obj.close();
    }
}
