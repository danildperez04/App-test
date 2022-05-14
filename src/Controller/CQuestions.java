package Controller;

import Model.Question;
import Model.Test;
import View.FrmQuestions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class CQuestions {
    public CQuestions(FrmQuestions view, Question model){
        this.view = view;
        this.model = model;
        initQuestions();
    }
    
    public void initQuestions(){
        System.out.println("initQuestions");
        englishTestModel.addQuestion(new Question("Cual es la pregunta", new String[]{"Nada", "Si hay", "no", "Ya"}, "/Imagenes/ayudar.png", 0));
        btnAnswers = new JButton[]{view.BtnResp1, view.BtnResp2, view.BtnResp3, view.BtnResp4};
        ArrayList<Question> questions = englishTestModel.getQuestions();
        
        view.BtnResp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                updateQuestion(questions.get(0));
            }
        });
    }
    
    public void updateTest(){
        ArrayList<Question> questions = englishTestModel.getQuestions();//Retorna las preguntas totales del test
    }
    
    public void updateQuestion(Question nextQuestion){
        int i = 0;
        for(String answers : nextQuestion.getAnswers()){//Recorre todas las preguntas
            btnAnswers[i].setText(answers);
            i++;
        }
        System.out.println("UpdateQuestion");
    }
    
    private FrmQuestions view;
    private Question model;
    private Test englishTestModel = new Test();
    private JButton[] btnAnswers;   
}
