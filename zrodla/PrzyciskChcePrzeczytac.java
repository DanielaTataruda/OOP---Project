import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PrzyciskChcePrzeczytac extends JButton {

    public PrzyciskChcePrzeczytac(Ksiazka ksiazka, int rozmiarCzcionki, boolean pogrubienie, int x, int y, int szerokosc, int wysokosc) 
    {
        super("Chcę przeczytać");

        int dx = 2;
        setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);

        addActionListener((ActionEvent e) -> 
        {
            OknoKsiazki okno = (OknoKsiazki)SwingUtilities.getWindowAncestor(this);
            new BazaDoPrzeczytania().dodajKsiazke(ksiazka);
            okno.baza.usunKsiazke(ksiazka);
            okno.setVisible(false);
            okno.dispose();
            new OknoGlowne().setVisible(true);
        });
    }
}
