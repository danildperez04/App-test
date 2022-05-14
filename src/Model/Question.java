package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Question {
    //Constructors
    public Question(){}
    
    public Question(String questionLabel, String[] answers, String src, int index) {
        this.questionLabel = questionLabel;
        this.answers = answers;
        this.imageLabel = new ImageIcon(getClass().getResource(src));
        this.index = index;
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
    
    public int getIndex() {
        return index;
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

    public void setIndex(int index) {
        this.index = index;
    }
    
    //User
    @Override
    public String toString(){
        return "Question: " + questionLabel + "\nAnswers: " + answers.toString() + "\nImage: " + imageLabel.toString() + "Index: " + index;
    }
    
    //Fields
    private String questionLabel;
    private String[] answers;
    private Icon imageLabel;
    private int index;
}
