package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Test implements Serializable{

    public boolean isStatus() {
        return status;
    }
    
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public void addQuestion(Question question) {
        this.questions.add(question);
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Test Fields
    private ArrayList<Question> questions = new ArrayList<Question>();//Grupo de preguntas del test
    private boolean status;
}
