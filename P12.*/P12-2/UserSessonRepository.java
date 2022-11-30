public class UserSessonRepository implements SessionRepository {
    User user;

    public void setSession(User user) {
        this.user = user;
    }

    public User getSession() {
        return user;
    }

    public void destroySession() {
        user = null;
    }

    public void updateSession(User user) {
        this.user = user;
    }
}
