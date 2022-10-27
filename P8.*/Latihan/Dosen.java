public class Dosen extends User {
    private String pangkat, golongan, key;

    public Dosen(String username, String password, double phone, String key) { super(username, password, phone); this.key = key; }
    public Dosen(String username, String password, String key) { super(username, password); this.key = key; }
    public Dosen(String username, String password, double phone) { super(username, password, phone); }

    public boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) return true;
        else return false;
    }
    public boolean login(String username, String password, String key) {
        if(this.username.equals(username) && this.password.equals(password) && this.key.equals(key)) return true;
        else return false;
    }
    public boolean login(Double phone, String password) {
        if(this.phone == phone && this.password.equals(password)) return true;
        else return false;
    }
    public boolean login(Double phone, String password, String key) {
        if(this.phone == phone && this.password.equals(password) && this.key.equals(key)) return true;
        else return false;
    }
}
