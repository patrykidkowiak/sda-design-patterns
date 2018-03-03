package pl.sda.poznan.builder;

import java.time.LocalDate;

public class Reservation {
    private LocalDate date;
    private int headcount;
    private String city;
    private double price;

    private Reservation() {
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHeadcount() {
        return headcount;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static ReservationBuilder builder() {
        return new ReservationBuilder();
    }




    public static class ReservationBuilder {
        private LocalDate date;
        private int headcount;
        private String city;
        private double price;

        //fluent API
        public ReservationBuilder date(LocalDate val) {
            this.date = val;
            return this;
        }

        public ReservationBuilder headcount(int val) {
            this.headcount = val;
            return this;
        }

        public ReservationBuilder city(String val) {
            this.city = val;
            return this;
        }

        public ReservationBuilder price(double val) {
            this.price = val;
            return this;
        }

        public Reservation build() {
            Reservation reservation = new Reservation();
            reservation.setHeadcount(this.headcount);
            reservation.setCity(this.city);
            reservation.setDate(this.date);
            reservation.setPrice(this.price);
            return reservation;
        }
    }
}
