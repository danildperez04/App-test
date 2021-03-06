package Controller;

import Model.*;
import View.FrmQuestions;
import View.FrmResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;

public class CQuestions {
    public CQuestions(FrmQuestions view, Question model, Test test){
        this.view = view;
        this.model = model;
        this.testModel = test;
        this.btnAnswers = new JButton[]{view.BtnResp1, view.BtnResp2, view.BtnResp3, view.BtnResp4};

        getSequence(testModel.getQuestions().size());
        questions = testModel.getQuestions();
        updateQuestion(questions.get(sequenceQuestions.get(0)));
        initButtons();
    }

    public void initButtons(){
        view.BtnResp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                pressButton(view.BtnResp1.getText());
            }
        });
        view.BtnResp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                pressButton(view.BtnResp2.getText());
            }
        });
        view.BtnResp3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                pressButton(view.BtnResp3.getText());
            }
        });
        view.BtnResp4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                pressButton(view.BtnResp4.getText());
            }
        });
    }

    public void pressButton(String textBtn){
        if(n < questions.size()){
            answerIsCorrect(textBtn);
            updateQuestion(questions.get(sequenceQuestions.get(n)));
            n++;
        } else {
            FrmResultados frmResults = new FrmResultados();
            CResults cResults = new CResults(frmResults, questions);//Aqui se manda la info a resultados
            frmResults.setVisible(true);
            view.dispose();
        }
    }

    public void answerIsCorrect(String textBtn){
        Question question = questions.get(sequenceQuestions.get(n-1));
        System.out.println(textBtn+" == "+question.getCorrectAnswer());
        if(textBtn.equals(question.getCorrectAnswer())){
            question.setIsCorrect(true);
        }
    }

    public void updateQuestion(Question nextQuestion){//
        System.out.println(nextQuestion);
        int i = 0;
        for(String answers : nextQuestion.getAnswers()){//Recorre todas las preguntas
            btnAnswers[i].setText(answers);
            i++;
        }
        view.LblPregunta.setText(nextQuestion.getQuestionLabel());
        view.LblImagenPregunta.setIcon(nextQuestion.getImageLabel());
        System.out.println("Question updated\n\n");
    }

    public void getSequence(int max) {//Generate a random sequence for the questions in the test
        Random rnd = new Random();
        for (int i = 0; i < max; i++) {
            int aleatorio = -1;
            boolean generado = false;

            while (!generado) {
                int number = rnd.nextInt(max);
                if (!sortedQuestions.contains(number)) {
                    sortedQuestions.add(number);
                    aleatorio = number;
                    generado = true;
                }
            }
            sequenceQuestions.add(aleatorio);
        }
        System.out.println(sequenceQuestions.toString());
    }

    private FrmQuestions view;
    private Question model;
    private Test testModel = new Test();
    private JButton[] btnAnswers = new JButton[4];
    private ArrayList<Question> questions = null;
    private Set<Integer> sortedQuestions = new HashSet<>();
    private ArrayList<Integer> sequenceQuestions = new ArrayList<>();
    private int n = 1;
}
