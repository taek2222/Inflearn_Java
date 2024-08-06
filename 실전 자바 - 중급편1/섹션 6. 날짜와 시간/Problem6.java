import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("년도를 입력하세요: ");
        int year = Integer.parseInt(br.readLine());

        System.out.print("월을 입력하세요: ");
        int month = Integer.parseInt(br.readLine());

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate nextDate = date.plusMonths(1);

        int weekDays = date.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < weekDays; i++) {
            System.out.println("    ");
        }

        LocalDate dayIterator = date;
        while (dayIterator.isBefore(nextDate)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
