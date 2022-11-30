public class Router {

    public void login() {
        LoginView loginView = new LoginView();
        LoginPresenter loginPresenter = new LoginPresenter(null, null);
        loginView.generatePresenter(loginPresenter);
        loginView.start();
    }
}
