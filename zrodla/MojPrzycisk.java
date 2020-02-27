import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MojPrzycisk extends JButton {

    public MojPrzycisk(String napis, int numerOkna, int rozmiarCzcionki, boolean pogrubienie, int x, int y, int szerokosc, int wysokosc) 
    {
        super(napis);

        int dx = 2;
        setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);

        addActionListener((ActionEvent e) -> 
        {
            if(numerOkna == 1) 
            {
                new OknoGlowne().setVisible(true);
            }
            if(numerOkna == 2)
            {
                new OknoKsiazki(new BazaKsiazek()).setVisible(true);
            }
            if(numerOkna == 3)
            {
                new OknoKsiazki(new BazaDoPrzeczytania()).setVisible(true);
            }
            if(numerOkna == 4)
            {
                new OknoKsiazki(new BazaCzytane()).setVisible(true);
            }
            if(numerOkna == 5)
            {
                new OknoKsiazki(new BazaPrzeczytane()).setVisible(true);
            }
            JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
            frame.setVisible(false);
            frame.dispose();
        });
    }
}
