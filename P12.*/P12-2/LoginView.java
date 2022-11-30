public class LoginView implements BaseView {
    public BasePresenter mPresenter;

    public void generatePresenter(BasePresenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    public void start() {
        System.out.println("LoginView started");
    }
}
