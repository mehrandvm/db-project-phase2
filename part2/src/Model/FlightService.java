package Model;

public class FlightService extends Service {

    private long id;
    private String airline;
    private String date;
    private String destination;
    private int seatCount;
    private String type;
    private String time;

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public void setCost(long cost) {
        super.setCost(cost);
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String getType() {
        return type;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String getTime() {
        return time;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return "FlightService{" +
                "id=" + id +
                ", airline='" + airline + '\'' +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
