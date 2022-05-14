package Controller;

import Model.Question;
import View.FrmQuestions;

public class Main {
    public static void main(String[] args) {
        FrmQuestions frm = new FrmQuestions();
        Question model = new Question();
        CQuestions cQuestions = new CQuestions(frm, model);
        frm.setVisible(true);
    }
}
