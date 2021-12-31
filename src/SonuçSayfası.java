import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SonuçSayfası extends  JFrame{
    private JPanel Sonuc_Sayfası;
    private JButton çıkışButton;

    public SonuçSayfası(){

    add(Sonuc_Sayfası);
    setSize(400, 200);
    setTitle("İlk Swing Form");

        çıkışButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

