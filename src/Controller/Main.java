package Controller;

import Model.Question;
import Model.Test;
import Model.User;
import View.FrmLogin;
import View.FrmMenu;
import View.FrmQuestions;
import View.FrmResultados;

public class Main {

    public static void main(String[] args) {

        FrmLogin loginView = new FrmLogin();
        User userModel = new User();
        CLogin loginController = new CLogin(loginView, userModel);
        FrmMenu menuView = new FrmMenu();
        CMenu cMenu = new CMenu(menuView);
        //menuView.setVisible(true);
        loginView.setVisible(true);
    }
}
