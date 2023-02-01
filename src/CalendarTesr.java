import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTesr {
    static Calendar birthDate;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static int getDayOfWeek(Calendar calendar) {
        birthDate = new GregorianCalendar(1998, 6, 11);
        int day = birthDate.get(Calendar.DAY_OF_WEEK);
        return day;

    }
}





