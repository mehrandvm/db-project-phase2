package Model;

public class HotelService extends Service {
    private String type;
    private String options;
    private long price;
    private int popularity;
    private int rating;

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public void setTime(String time) {
        super.setTime(time);
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);
    }

    @Override
    public void setCost(long cost) {
        super.setCost(cost);
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getType() {
        return type;
    }

    public String getOptions() {
        return options;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String getTime() {
        return super.getTime();
    }

    @Override
    public long getCost() {
        return super.getCost();
    }

    @Override
    public String toString() {
        return "HotelService{" +
                "type='" + type + '\'' +
                ", options='" + options + '\'' +
                ", price=" + price +
                ", popularity=" + popularity +
                ", rating=" + rating +
                '}' + super.toString();
    }
}

