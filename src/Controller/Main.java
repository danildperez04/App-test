package Controller;

import Model.Question;
import Model.Test;
import View.FrmQuestions;

public class Main {
    public static void main(String[] args) {
        FrmQuestions frm = new FrmQuestions();
        Question model = new Question();
        Test englishTest = new Test();
        englishTest.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, 0));
        englishTest.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, 2));
        englishTest.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, 3));
        englishTest.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, 0));
        englishTest.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, 0));
        englishTest.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, 3));
        englishTest.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, 1));
        englishTest.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, 1));
        englishTest.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, 3));
        englishTest.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, 2));
        CQuestions cQuestions = new CQuestions(frm, model, englishTest);
        frm.setVisible(true);
         
    }
}
