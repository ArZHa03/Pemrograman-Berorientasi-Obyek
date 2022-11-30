public interface SessionRepository {
    public String SHARED_PREFERENCE_NAME = "session";

    public void setSession(User user);

    public User getSession();

    public void destroySession();

    public void updateSession(User user);
}
