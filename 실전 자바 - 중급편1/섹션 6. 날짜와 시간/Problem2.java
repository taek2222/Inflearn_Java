import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Problem2 {
    public static void main(String[] args) {
        LocalDate dateTime = LocalDate.of(2024,1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = dateTime.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + (i+1) + ": " + nextDate);
        }
    }
}
