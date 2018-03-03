package pl.sda.poznan.builder;

import pl.sda.poznan.builder.Reservation.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ReservationParser {
    public static Reservation parse(String s) {
        String[] split = s.split(", ");
        ReservationBuilder rb = Reservation.builder();
        for (int i = 0; i < split.length; i += 2) {
            String key = split[i];
            String value = split[i + 1];
            if (key.toLowerCase().equals("date")) rb.date(LocalDate.parse(value));
            else if (key.toLowerCase().equals("headcount")) rb.headcount(Integer.parseInt(value));
            else if (key.toLowerCase().equals("city")) rb.city(value);
            else if (key.toLowerCase().equals("price")) rb.price(Double.parseDouble(value));
        }

        return rb.build();
    }
}
