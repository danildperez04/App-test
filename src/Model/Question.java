package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Question {
    //Constructors
    public Question(){}
    
    public Question(String questionLabel, String[] answers, String src, int indexQuestion, int indexCorrectAnswer) {
        this.questionLabel = questionLabel;
        this.answers = answers;
        this.imageLabel = new ImageIcon(getClass().getResource(src));
        this.indexQuestion = indexQuestion;
        this.indexCorrectAnswer = indexCorrectAnswer;
        
        
    }
    
    //Getters
    public String getQuestionLabel() {
        return questionLabel;
    }

    public Icon getImageLabel() {
        return imageLabel;
    }

    public String[] getAnswers() {
        return answers;
    }
    
    public int getIndexQuestion() {
        return indexQuestion;
    }
    
    public int getIndexCorrectAnswer() {
        return indexCorrectAnswer;
    }

    //Setters
    public void setQuestionLabel(String questionLabel) {
        this.questionLabel = questionLabel;
    }
    
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public void setImageLabel(String src) {
        this.imageLabel = new ImageIcon(getClass().getResource(src));
    }

    public void setIndex(int indexQuestion) {
        this.indexQuestion = indexQuestion;
    }
    
    public void setIndexCorrectAnswer(int indexCorrectAnswer) {
        this.indexCorrectAnswer = indexCorrectAnswer;
    }
    
    //User
    @Override
    public String toString(){
        return "Question: " + questionLabel + "\nAnswers: " + answers.toString() + "\nImage: " + imageLabel.toString() + 
                "Index: " + indexQuestion + "Index correct answer: " + indexCorrectAnswer; 
    }
    
    //Fields
    private String questionLabel;
    private String[] answers;
    private Icon imageLabel;
    private int indexQuestion;
    private int indexCorrectAnswer;
}
