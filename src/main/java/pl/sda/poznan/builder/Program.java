package pl.sda.poznan.builder;

public class Program {
    public static void main(String[] args) {
        String toParse ="Date, 2018-02-02, Headcount, 250, City, Poznan, Price, 99";
        Reservation myReservation = ReservationParser.parse(toParse);
        System.out.println(myReservation);
    }
}
