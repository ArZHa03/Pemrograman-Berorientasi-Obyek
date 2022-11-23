public interface DataSource {
    public void connect();

    public void disconnect();

    public void executeQuery();
}
