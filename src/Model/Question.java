package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Question {
    //Constructors
    public Question(){}
    
    public Question(String questionLabel, String[] answers, String src, int idQuestion, String correctAnswer) {
        this.questionLabel = questionLabel;
        this.answers = answers;
        this.imageLabel = new ImageIcon(getClass().getResource(src));
        this.correctAnswer = correctAnswer;
        this.idQuestion = idQuestion;
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
    
    public String getCorrectAnswer() {
      return correctAnswer;
    }  
    
    public boolean isIsCorrect() {
        return isCorrect;
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

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
    
    
    //User
    @Override
    public String toString(){
        return "Question: " + questionLabel + "\nAnswers: " + answers.toString() + "\nImage: " + imageLabel.toString();
    }
    
    //Fields
    private String questionLabel;
    private String[] answers;
    private boolean isCorrect;
    private Icon imageLabel;
    private String correctAnswer;
    private int idQuestion;
}
