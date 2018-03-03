package pl.sda.poznan.builder;

import com.sun.org.apache.regexp.internal.RE;

import java.time.LocalDate;

public class Playground {
    public static void main(String[] args) {
        Reservation.ReservationBuilder rb = Reservation.builder()
                .city("Poznan")
                .headcount(100)
                .price(99d);

        rb.date(LocalDate.parse("2018-03-03"));
        Reservation build = rb.build();
        System.out.println(build);


        Reservation wroclaw = Reservation.builder()
                .date(LocalDate.parse("2018-08-08"))
                .price(100)
                .headcount(200)
                .city("Wroclaw")
                .build();


    }
}
