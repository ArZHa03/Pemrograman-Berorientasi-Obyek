public class LoginPresenter implements IloginPresenter {
    private User user;
    private IloginView loginView;

    public boolean performLogin(String username, String password) {
        user = new User(username, password);
        if (user.isValid()) {
            loginView.redirectToProfile();
            return true;
        } else {
            loginView.showErrorMessage("Invalid username or password");
            return false;
        }
    }
}
