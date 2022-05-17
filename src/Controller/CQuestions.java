package Controller;

import Model.*;
import View.FrmQuestions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;

public class CQuestions {
    public CQuestions(FrmQuestions view, Question model){
        this.view = view;
        this.model = model;
        this.btnAnswers = new JButton[]{view.BtnResp1, view.BtnResp2, view.BtnResp3, view.BtnResp4};
        initQuestions();
        getSequence(englishTestModel.getQuestions().size());
        System.out.println(englishTestModel.getQuestions().size());
        updateQuestion(questions.get(sequenceQuestions.get(0)));
        initButtons();
    }
    
    public void initQuestions(){
        //System.out.println("initQuestions");
        englishTestModel.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, 0));
        englishTestModel.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, 2));
        englishTestModel.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, 3));
        englishTestModel.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, 0));
        englishTestModel.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, 0));
        englishTestModel.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, 3));
        englishTestModel.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, 1));
        englishTestModel.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, 1));
        englishTestModel.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, 3));
        englishTestModel.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, 2));
        //System.out.println("initQuestions2");
    }
    
    public void initButtons(){
        view.BtnResp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                answerIsCorrect(0);
                pressButton();
            }
        });
        view.BtnResp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                answerIsCorrect(1);
                pressButton();
            }
        });
        view.BtnResp3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                answerIsCorrect(2);
                pressButton();
            }
        });
        view.BtnResp4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                answerIsCorrect(3);
                pressButton();
            }
        });
    }
    
    public void pressButton(){
        if(n < 10){
            updateQuestion(questions.get(sequenceQuestions.get(n)));
            n++;
        }
        else{
            view.dispose();
        }
    }
    
    public void answerIsCorrect(int indexButton){
        /*var button = btnAnswers[indexButton];
        var buttonColor = button.getBackground();
        if(indexButton == questions.get(sequenceQuestions.get(n-1)).getIndexCorrectAnswer())
            button.setBackground(Color.green);
        else
            button.setBackground(Color.red);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        button.setBackground(buttonColor);*/
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
    private Test englishTestModel = new Test();
    private JButton[] btnAnswers= new JButton[4];
    private ArrayList<Question> questions = englishTestModel.getQuestions();
    private Set<Integer> sortedQuestions = new HashSet<>();
    private ArrayList<Integer> sequenceQuestions = new ArrayList<>();
    private int n = 1;
}
