package Model;

import java.util.ArrayList;

public class Test {

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public void addQuestion(Question question) {
        this.questions.add(question);
    }
    
    //Test Fields
    private ArrayList<Question> questions = new ArrayList<Question>();//Grupo de preguntas del test
}
