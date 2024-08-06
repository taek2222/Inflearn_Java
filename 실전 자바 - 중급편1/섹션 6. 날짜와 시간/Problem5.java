import java.time.*;
import java.util.TimeZone;

public class Problem5 {
    public static void main(String[] args) {
        ZonedDateTime koreaDateTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDateTime = koreaDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyDateTime = koreaDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + koreaDateTime);
        System.out.println("런던의 회의 시간: " + londonDateTime);
        System.out.println("뉴욕의 회의 시간: " + nyDateTime);
    }
}
