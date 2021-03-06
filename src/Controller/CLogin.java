package Controller;

import Model.IComponentsHandler;
import Model.Test;
import Model.User;
import View.FrmLogin;
import View.FrmMenu;
import View.FrmResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CLogin implements IComponentsHandler {

    public CLogin(FrmLogin view, User model) {
        this.view = view;
        this.model = model;

        initButtons();
    }

    public void initButtons() {
        view.BtnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (validateLogin()) {
                    CResults.setCarnet(view.FtxtSignInCarnet.getText().trim());
                    FrmMenu menuView = new FrmMenu();
                    CMenu cMenu = new CMenu(menuView);
                    view.dispose();
                    menuView.setVisible(true);
                    String carnet = view.FtxtSignInCarnet.getText();
                    users = FileStream.getUsers();
//                    users.get(carnet).getTests().get(0).setStatus(true);
//                    users.get(carnet).getTests().get(1).setStatus(true);
                    if(users.get(carnet).getTests().get(0).isStatus()){
                        menuView.LblEstadoA1.setText("Completado");
                    }
                    if(users.get(carnet).getTests().get(1).isStatus()){
                        menuView.LblEstadoA2.setText("Completado");
                    }
                    if(users.get(carnet).getTests().get(2).isStatus()){
                        menuView.LblEstadoB1.setText("Completado");
                    }
                    if(users.get(carnet).getTests().get(3).isStatus()){
                        menuView.LblEstadoB2.setText("Completado");
                    }
                    
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "SU CONTRASEÑA, CARNET O NOMBRE DE USUARIO SON INCORRECTOS, POR FAVOR INGRESE CORRECTAMENTE SUS DATOS PARA CONTINUAR", "SIGN IN", 2);
                }
                clearFields();
            }
        });

        view.BtnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                validateSingup();
                clearFields();
            }
        });
    }

    public boolean validateLogin() {
        String encryptedPassword = Encryption.encryptThisString(view.TxtPassword.getText());
        String carnet = view.FtxtSignInCarnet.getText();
        users = FileStream.getUsers();
  
        if (users != null && users.get(carnet) != null) {
            if (users.get(carnet).getPassword().equals(encryptedPassword)) {
                return true;
            }
        }

        return false;
    }

    public void validateSingup() {

        String password = passwordProcessing(view.TxtSignUpPassword.getText());
        String name = view.TxtSignUpUsername.getText().trim();
        String carnet = view.FtxtSignUpCarnet.getText().trim();

        if (!(name.equals("") && password.equals("") && carnet.equals("-"))) {
            User user = new User(name, carnet, password, initTest());
            FileStream.setNewUser(user);
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR RELLENE TODOS LOS CAMPOS", "LOG IN", 2);
        }

    }

    public String passwordProcessing(String password) {
        if (password.length() >= 8) {
            return Encryption.encryptThisString(password);
        } else {
            JOptionPane.showMessageDialog(null, "SU CONTRASEÑA DEBE TENER POR LO MENOS 8 CARACTERES", "PASSWORD", 2);
        }
        return "";
    }

    @Override
    public void clearFields() {
        view.FtxtSignInCarnet.setText("");
        view.TxtPassword.setText("");
        view.FtxtSignUpCarnet.setText("");
        view.TxtSignUpUsername.setText("");
        view.TxtSignUpPassword.setText("");

    }

    public ArrayList<Test> initTest() {
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
