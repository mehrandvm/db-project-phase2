package Model;

public class BusService extends Service {
    private String company;
    private String date;
    private String depTime;
    private String depTerminal;
    private String destination;

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setCost(long cost) {
        super.setCost(cost);
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
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
    public String getTime() {
        return super.getTime();
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public String getDepTerminal() {
        return depTerminal;
    }

    public String getDepTime() {
        return depTime;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public long getCost() {
        return super.getCost();
    }


    @Override
    public String toString() {
        return "BusService{" +
                "company='" + company + '\'' +
                ", date='" + date + '\'' +
                ", depTime='" + depTime + '\'' +
                ", depTerminal='" + depTerminal + '\'' +
                ", destination='" + destination + '\'' +
                '}' + super.toString();
    }
}
