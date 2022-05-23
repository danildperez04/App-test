package Controller;

import Model.Test;
import Model.User;
import View.FrmLogin;
import View.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CLogin {
    public CLogin(FrmLogin view, User model){
        this.view = view;
        this.model = model;
        
        initButtons();
    }
    
    public void initButtons(){
        view.BtnSignIn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(validateLogin()){
                    FrmMenu menuView = new FrmMenu();
                    menuView.setVisible(true);
                
                    view.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "SU CONTRASEÑA, CARNET O NOMBRE DE USUARIO SON INCORRECTOS, POR FAVOR INGRESE CORRECTAMENTE SUS DATOS PARA CONTINUAR", "SIGN IN", 2);
                }
            }
        });
        
        view.BtnSignUp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                validateSingup();
            }
        });
    }
    
    public boolean validateLogin(){
        String encryptedPassword = Encryption.encryptThisString(view.TxtPassword.getText());
        String carnet = view.TxtCarnet.getText();
        users = FileStream.getUsers();
        if(users != null){
            User user = users.get(carnet);
            System.out.println(user.toString());
            if(user.getPassword().equals(encryptedPassword)){
                return true;
            }
        }
        return false;
    }
    
    public void validateSingup(){
        String encryptedPassword = Encryption.encryptThisString(view.TxtSignUpPassword.getText());
        String name = view.TxtSignUpUsername.getText();
        String carnet = view.TxtSignUpCarnet.getText();
        
        User user = new User(name, carnet, encryptedPassword, initTest());
        FileStream.setNewUser(user);
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
    private HashMap<String, User> users = new HashMap<>();
}
