package pl.camp.it;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Date date = new Date();

        System.out.println(date);*/

        Instant instant = Instant.now();

        System.out.println(instant);

        Instant instant2 = Instant.now();

        System.out.println(instant2);

        Duration przedzialCzasu = Duration.between(instant, instant2);

        System.out.println(przedzialCzasu);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDate customDate = LocalDate.of(1995, 10, 20);
        System.out.println(customDate);

        LocalTime customTime = LocalTime.of(15, 34, 45);
        System.out.println(customTime);

        LocalDateTime customLocalDateTime = LocalDateTime.of(customDate, localTime);
        System.out.println(customLocalDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2021, 06, 20),
                        LocalTime.of(11, 04, 30)
                ),
                ZoneId.of("Europe/Warsaw")
        );

        System.out.println(zonedDateTime2);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(zonedDateTime2.toInstant(), ZoneId.of("Australia/Darwin"));

        System.out.println(zonedDateTime3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String regex = "[0-9]{4}/[0-9]{2}/[0-9]{2}";

        String data = "2021/06/20";

        LocalDate dataLokalna = LocalDate.parse(data, formatter);

        System.out.println(dataLokalna);

        String dataStringowa = dataLokalna.format(formatter);

        System.out.println(dataStringowa);
    }
}
