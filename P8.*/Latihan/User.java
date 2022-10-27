public class User {
    protected String id, username, password;
    protected double phone;

    public User(String username, String password) {
        this.username = username; this.password = password;
    }

    public User(String username, String password, double phone) {
        this.username = username; this.password = password; this.phone = phone;
    }

    public boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) return true;
        else return false;
    }

    public boolean login(Double phone, String password) {
        if(this.phone == phone && this.password.equals(password)) return true;
        else return false;
    }
}
