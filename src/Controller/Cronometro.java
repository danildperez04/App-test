package Controller;

import View.FrmQuestions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


import javax.swing.Timer;

public class Cronometro extends FrmQuestions{

    //FrmQuestions menu = new FrmQuestions();

    Timer timer;
    int second, minute;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");

//    public static void main(String[] args) {
//
//        new Cronometro();
//    }

    public void Cronometro() {


        //menu.setVisible(true);

        gali.setText("03:00");
        second = 0;
        minute = 3;
        countdownTimer();
        timer.start();
    }

    public void countdownTimer() {

        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                gali.setText(ddMinute + ":" + ddSecond);

                if (second == -1) {
                    second = 59;
                    minute--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    gali.setText(ddMinute + ":" + ddSecond);
                }
                if (minute == 0 && second == 0) {
                    timer.stop();
                }
            }
        });
    }
}
