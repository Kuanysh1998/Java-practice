public class WeekDays {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.toLowerCase().equals("понедельник")) {
            en = "Monday";
        }
        if (ru.toLowerCase().equals("вторник")) {
            en = "Tuesday";
        }
        if (ru.toLowerCase().equals("среда")) {
            en = "Wednesday";
        }
        if (ru.toLowerCase().equals("четверг")) {
            en = "Thursday";
        }
        if (ru.toLowerCase().equals("пятница")) {
            en = "Friday";
        }
        if (ru.toLowerCase().equals("суббота")) {
            en = "Saturday";
        }
        if (ru.toLowerCase().equals("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;

    }
}
