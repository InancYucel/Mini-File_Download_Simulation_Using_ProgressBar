import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DosyaIndirme extends JFrame {
    private int say;
    private JPanel DosyaİndirmeSimilasyonu;
    private JProgressBar chechProgress;
    private JButton dosyaİndirmeyiBaşlatButton;

    public DosyaIndirme() {

        add(DosyaİndirmeSimilasyonu);
        setSize(400, 200);
        setTitle("İlk Swing Form");



        dosyaİndirmeyiBaşlatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Timer timer = new Timer(50,null);

                timer.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        say++;
                        chechProgress.setValue(say);

                        if(chechProgress.getValue() == 100){

                            JOptionPane.showMessageDialog(DosyaIndirme.this,"Dosya indirme tamamlandı");

                            timer.stop();

                            SonuçSayfası sonucsayfası = new SonuçSayfası();

                            setVisible(false);

                            sonucsayfası.setVisible(true);



                        }

                    }
                });

                timer.start();
            }
        });
    }
    public static void main (String[]args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                DosyaIndirme DI = new DosyaIndirme();
                DI.setVisible(true);

            }
        });


    }

}
