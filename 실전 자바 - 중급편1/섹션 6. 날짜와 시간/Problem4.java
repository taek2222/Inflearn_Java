import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Problem4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);

        System.out.println("firstDayOfWeek = " + date.getDayOfWeek());
        System.out.println("lastDayOfWeek = " + date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

    }
}
