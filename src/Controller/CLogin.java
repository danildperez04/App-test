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
                    FrmMenu menuView = new FrmMenu();
                    CMenu cMenu = new CMenu(menuView);
                    view.dispose();
                    menuView.setVisible(true);

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
