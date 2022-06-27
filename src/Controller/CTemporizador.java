package Controller;

/**
 *
 * @author Galileo blandón
 */
import java.util.Timer;
import java.util.TimerTask;
import View.FrmQuestions;
public class CTemporizador {

    /**
     * @param args the command line arguments
     */
    public void temporizador(FrmQuestions ventana) {
        ventana.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int segundos = 60;
            int minutos = 5;

            public void run() {

                ventana.LblTemporizador.setText(minutos+" : " +segundos);
                segundos--;

                if (segundos < 0) {
                    segundos += 60;
                    minutos--;
                    if (minutos < 0) {
                        timer.cancel();
                        ventana.LblTemporizador.setText("Time Over");
                    }
                }
            }
        }, 0, 1000);
    }
}