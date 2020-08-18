import java.util.Calendar;

public class Main {
    public static void leapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        if (noOfDays != 365) System.out.println(year);
    }
    
    public static void main(String[] args) {
        for (int i = 1995; i < 2050; i++) {
            leapYear(i);
        }
    }
}
