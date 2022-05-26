/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Model.Test;
import Model.Question;
import View.FrmMenu;
import View.FrmQuestions;

/**
 *
 * @author Roman Rizo
 */
public class CMenu {

    public CMenu(FrmMenu view) {
        this.view = view;
        initButtons();
    }

    public void initButtons() {
        view.A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        
        view.A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        
        view.B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        
        view.B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

    }

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here
        FrmQuestions frmQuestions = new FrmQuestions();
        Question model = new Question();
        Test englishTest = new Test();
        englishTest.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        CQuestions cQuestions = new CQuestions(frmQuestions, model, englishTest);
        view.dispose();
        frmQuestions.setVisible(true);
    }

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here
        FrmQuestions frmQuestions = new FrmQuestions();
        Question model = new Question();
        Test englishTest = new Test();
        englishTest.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        CQuestions cQuestions = new CQuestions(frmQuestions, model, englishTest);
        view.dispose();
        frmQuestions.setVisible(true);
    }

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here
        FrmQuestions frmQuestions = new FrmQuestions();
        Question model = new Question();
        Test englishTest = new Test();
        englishTest.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        CQuestions cQuestions = new CQuestions(frmQuestions, model, englishTest);
        view.dispose();
        frmQuestions.setVisible(true);
    }

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here
        FrmQuestions frmQuestions = new FrmQuestions();
        Question model = new Question();
        Test englishTest = new Test();
        englishTest.addQuestion(new Question("Cual es la pregunta1", new String[]{"Nada1", "Si hay1", "no1", "Ya1"}, "/Imagenes/pregunta (1).png", 0, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta2", new String[]{"Nada2", "Si hay2", "no2", "Ya2"}, "/Imagenes/confuso.png", 1, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta3", new String[]{"Nada3", "Si hay3", "no3", "Ya3"}, "/Imagenes/unicornio.png", 2, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta4", new String[]{"Nada4", "Si hay4", "no4", "Ya4"}, "/Imagenes/idea.png", 3, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta5", new String[]{"Nada5", "Si hay5", "no5", "Ya5"}, "/Imagenes/pensando.png", 4, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta6", new String[]{"Nada6", "Si hay6", "no6", "Ya6"}, "/Imagenes/idea (1).png", 5, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta7", new String[]{"Nada7", "Si hay7", "no7", "Ya7"}, "/Imagenes/pensar.png", 6, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta8", new String[]{"Nada8", "Si hay8", "no8", "Ya8"}, "/Imagenes/profesor.png", 7, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta9", new String[]{"Nada9", "Si hay9", "no9", "Ya9"}, "/Imagenes/reina.png", 8, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        englishTest.addQuestion(new Question("Cual es la pregunta10", new String[]{"Nada10", "Si hay10", "no10", "Ya10"}, "/Imagenes/reino-unido.png", 9, "", "https://www.britishcouncil.es/ingles/niveles/a1"));
        CQuestions cQuestions = new CQuestions(frmQuestions, model, englishTest);
        view.dispose();
        frmQuestions.setVisible(true);
    }

    private FrmMenu view;
}
