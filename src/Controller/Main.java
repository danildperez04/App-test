package Controller;

import Model.Question;
import Model.Test;
import Model.User;
import View.FrmLogin;
import View.FrmQuestions;
import View.FrmResultados;

public class Main {

    public static void main(String[] args) {

        FrmLogin loginView = new FrmLogin();
        User userModel = new User();
        CLogin loginController = new CLogin(loginView, userModel);
//        FrmQuestions frm = new FrmQuestions();
//        Question model = new Question();
//        
//        frm.setVisible(true);
        loginView.setVisible(true);
    }
}
