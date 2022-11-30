public class LoginPresenter implements BasePresenter {
    public SessionRepository sessionRepository;
    public View view;

    public LoginPresenter(SessionRepository sessionRepository, View view) {
        this.sessionRepository = sessionRepository;
        this.view = view;
    }
}
