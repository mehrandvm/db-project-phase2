package Model;

public class Transaction {

    private long credit;
    private long amount;
    private String description;
    private String type;
    private String time;
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public long getCredit() {
        return credit;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "credit=" + credit +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
