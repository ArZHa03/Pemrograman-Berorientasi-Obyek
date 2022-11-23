public class UserDataSource implements DataSource {
    public void connect() {
        System.out.println("Connecting to database");
    }

    public void disconnect() {
        System.out.println("Disconnecting from database");
    }

    public void executeQuery() {
        System.out.println("Executing query");
    }
}