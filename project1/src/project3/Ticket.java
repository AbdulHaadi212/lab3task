package project3;

//Ticket.java
import java.util.Date;

public class Ticket {
    private String source;
    private String destination;
    private Date dateOfJourney;
    private String time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    // Getters and Setters
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public Date getDateOfJourney() { return dateOfJourney; }
    public void setDateOfJourney(Date dateOfJourney) { this.dateOfJourney = dateOfJourney; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getBusNo() { return busNo; }
    public void setBusNo(String busNo) { this.busNo = busNo; }

    public String getSeatNo() { return seatNo; }
    public void setSeatNo(String seatNo) { this.seatNo = seatNo; }
}
