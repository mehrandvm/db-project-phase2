package Model;


public class User {
    private String phoneNumber;
    private String email;
    private String birthDate;
    private String gender;
    private String firstName;
    private String lastName;
    private String password;
    private long score;
    private long balance;
    private String cardNumber;
    private long id;

    public long getBalance() {
        return balance;
    }

    public long getId() {
        return id;
    }

    public long getScore() {
        return score;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setScore(long score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                ", balance=" + balance +
                ", cardNumber='" + cardNumber + '\'' +
                ", id=" + id +
                '}';
    }
}
