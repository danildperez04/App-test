/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Question;
import View.FrmResultados;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author Roman Rizo
 */
public class CResults {

    public CResults() {
    }

    public CResults(FrmResultados view, ArrayList<Question> model) {
        this.view = view;
        this.questions = model;
        this.btnsHelp = new JButton[]{view.Button1, view.Button2, view.Button3, view.Button4, view.Button5, view.Button6, view.Button7, view.Button8, view.Button9, view.Button10};
        this.questionsLabel = new JLabel[]{view.Question1, view.Question2, view.Question3, view.Question4, view.Question5, view.Question6, view.Question7, view.Question8, view.Question9, view.Question10};
        initBtnsHelp();
        initQuestionsLabel();
    }

    public  void initBtnsHelp() {
        for (int i = 0; i < 10; i++) {
            JButton actualButton = btnsHelp[i];
            String actualLink = questions.get(i).getLink();
        actualButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                try {
                    Desktop.getDesktop().browse(new URI(actualLink));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error, no se puede ejecutar la acción");
                }
            }
        });

        }

    }

    public void initQuestionsLabel() {
        for (int i = 0; i < 10; i++) {
            JLabel actualQuestionLabel = questionsLabel[i];
            actualQuestionLabel.setText(questions.get(i).getQuestionLabel());
            if (questions.get(i).getIsCorrect()) {
                actualQuestionLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

            } else {
                actualQuestionLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 44, 63), 2, true));

            }
        }
    }

    private FrmResultados view;
    private JButton[] btnsHelp = new JButton[10];
    private JLabel[] questionsLabel = new JLabel[10];
    private ArrayList<Question> questions = null;
    private int n = 1;
}
//new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, "")
