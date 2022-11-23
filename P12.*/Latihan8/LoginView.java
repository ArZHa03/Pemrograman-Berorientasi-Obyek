public class LoginView {
    private Button login_btn;
    private Button register_btn;
    private TextField username_tf;
    private TextField password_tf;
    private IloginPresenter loginPresenter = new LoginPresenter();

    public void login_btnClicked() {
        String username = username_tf.getText();
        String password = password_tf.getText();
        loginPresenter.performLogin(username, password);
    }

    public void register_btnClicked() {
        // TODO: implement this method later on when we learn about database and file
        // handling in Java SE 8 course
    }

    public void redirectToProfile() {
        // redirect to profile page
    }

    private void redirectToRegister() {
        // TODO Auto-generated method stub
    }
}
