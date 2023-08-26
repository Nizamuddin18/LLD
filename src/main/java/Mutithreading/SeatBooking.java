package Mutithreading;

public class SeatBooking {
    int totalSeats = 10;

    synchronized void bookSeats(int seats) {
        if (seats <= totalSeats) {
            System.out.println("Seat Booked Successfully by : " + Thread.currentThread().getName());
            totalSeats = totalSeats - seats;
            System.out.println("Current Total Seats Left : " + totalSeats);
        } else {
            System.out.println("The Seats are not available to the Number Seats trying to book by : " + Thread.currentThread().getName());
        }
    }
}

class MovieBookApp implements Runnable {
    static SeatBooking seatBooking;
    int seats;

    @Override
    public void run() {
        seatBooking.bookSeats(seats);
    }

    public static void main(String[] args) {
        seatBooking = new SeatBooking();


        MovieBookApp customer1 = new MovieBookApp();
        customer1.seats = 7;
        Thread thread1 = new Thread(customer1, "customer-1");
        thread1.start();

        MovieBookApp customer2 = new MovieBookApp();
        customer2.seats = 5;
        Thread thread2 = new Thread(customer1, "customer-2");
        thread2.start();


    }
}
