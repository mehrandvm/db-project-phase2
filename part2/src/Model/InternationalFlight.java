package Model;

public class InternationalFlight extends FlightService {
    private int flightLength;
    private int numOfStops;

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setSeatCount(int seatCount) {
        super.setSeatCount(seatCount);
    }

    @Override
    public void setDestination(String destination) {
        super.setDestination(destination);
    }

    @Override
    public void setDate(String date) {
        super.setDate(date);
    }

    @Override
    public void setAirline(String airline) {
        super.setAirline(airline);
    }

    @Override
    public void setTime(String time) {
        super.setTime(time);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public void setCost(long cost) {
        super.setCost(cost);
    }

    public void setFlightLength(int flightLength) {
        this.flightLength = flightLength;
    }

    public void setNumOfStops(int numOfStops) {
        this.numOfStops = numOfStops;
    }

    @Override
    public String getDestination() {
        return super.getDestination();
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public long getCost() {
        return super.getCost();
    }

    @Override
    public String getAirline() {
        return super.getAirline();
    }

    @Override
    public int getSeatCount() {
        return super.getSeatCount();
    }

    @Override
    public String getTime() {
        return super.getTime();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    public int getFlightLength() {
        return flightLength;
    }

    public int getNumOfStops() {
        return numOfStops;
    }

    @Override
    public String toString() {
        return "InternationalFlight{" +
                "flightLength=" + flightLength +
                ", numOfStops=" + numOfStops +
                '}' + super.toString();
    }
}
