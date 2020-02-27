import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PrzyciskCzytam extends JButton {

    public PrzyciskCzytam(Ksiazka ksiazka, int rozmiarCzcionki, boolean pogrubienie, int x, int y, int szerokosc, int wysokosc) 
    {
        super("Czytam");

        int dx = 2;
        setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);

        addActionListener((ActionEvent e) -> 
        {
            OknoKsiazki okno = (OknoKsiazki)SwingUtilities.getWindowAncestor(this);
            new BazaCzytane().dodajKsiazke(new KsiazkaCzytana(ksiazka));
            okno.baza.usunKsiazke(ksiazka);
            okno.setVisible(false);
            okno.dispose();
            new OknoGlowne().setVisible(true);
        });
    }
}
