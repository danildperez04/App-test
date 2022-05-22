package Controller;

import Model.User;
import View.FrmLogin;
import View.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                view.dispose();
            }
        });
    }
    
    public void validateLogin(){
        
    }
    
    FrmLogin view;
    User model;
}
