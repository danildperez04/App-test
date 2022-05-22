package Controller;

import Model.Test;
import Model.User;
import View.FrmLogin;
import View.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CLogin {
    public CLogin(FrmLogin view, User model){
        this.view = view;
        this.model = model;
        
        initButtons();
    }
    
    public void initButtons(){
        view.BtnSignIn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                FrmMenu menuView = new FrmMenu();
                menuView.setVisible(true);
                validateLogin();
                view.dispose();
            }
        });
    }
    
    public void validateLogin(){
        String encryptedPassword = Encryption.encryptThisString(view.TxtPassword.getText());
        String name = view.TxtSignUpUsername.getText();
        String carnet = view.TxtSignUpCarnet.getText();
    }
    
    public void validateSingup(){
        String encryptedPassword = Encryption.encryptThisString(view.TxtSignUpPassword.getText());
        String name = view.TxtSignUpUsername.getText();
        String carnet = view.TxtSignUpCarnet.getText();
        
        User user = new User(name, carnet, encryptedPassword, initTest());
    }
    
    public ArrayList<Test> initTest(){
        ArrayList<Test> tests = new ArrayList<Test>();
        Test a1 = new Test();
        Test a2 = new Test();
        Test b1 = new Test();
        Test b2 = new Test();
        tests.add(a1);
        tests.add(a2);
        tests.add(b1);
        tests.add(b2);
        return tests;
    }
    
    FrmLogin view;
    User model;
    private ArrayList<User> users;
}
