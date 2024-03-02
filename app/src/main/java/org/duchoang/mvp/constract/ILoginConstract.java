package org.duchoang.mvp.constract;

public interface ILoginConstract {
    interface  IView {
        void loginSuccess();
        void loginFailed();
    }
    interface IPresenter{
        void login(String username, String password);
    }
}
