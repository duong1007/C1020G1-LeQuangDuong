package models;

public class Tickets {
    private String movieName;
    private String seats;

    public Tickets(String movieName, String seats) {
        this.movieName = movieName;
        this.seats = seats;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
