package Model;

public class Service {
    private long id;
    private long cost;
    private String time;
    private String type;
    private String status;

    public void setType(String type) {
        this.type = type;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public long getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", cost=" + cost +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
