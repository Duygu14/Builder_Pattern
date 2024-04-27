//Product (Ürün) -> Ticket sınıfı
public class Ticket {
    private String passangerName;
    private String departureLocation;
    private String destination;
    private String date;
    private String seatNumber;

    public Ticket(){

    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String toString(){
        return "\nPassanger Name: "+passangerName+
                "\nDeparture Location: " +departureLocation+
                "\nDestination: "+destination+
                "\nDate: "+date+
                "\nSeat Number: "+seatNumber;
    }
}
