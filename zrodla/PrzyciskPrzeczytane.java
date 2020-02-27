import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PrzyciskPrzeczytane extends JPanel {

    private JButton przycisk;
    private JTextField tekst;
    private JLabel label;

    public PrzyciskPrzeczytane(Ksiazka ksiazka, int rozmiarCzcionki, boolean pogrubienie, int x, int y, int szerokosc, int wysokosc) 
    {
        setLayout(null);
        setBounds(x, y, szerokosc, wysokosc);

        int dx = 2;

        przycisk = new JButton();
        przycisk.setBounds(0 + dx, 0 + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
        przycisk.addActionListener((ActionEvent e) -> 
        {
            OknoKsiazki okno = (OknoKsiazki)SwingUtilities.getWindowAncestor(this);
            // sprawdzenie czy ocena jest poprawna // 
            // jesli niepoprawna nie reagujemy na wcisniecie //
            KsiazkaPrzeczytana nowa = new KsiazkaPrzeczytana(ksiazka, Integer.parseInt(tekst.getText()));
            new BazaPrzeczytane().dodajKsiazke(nowa);
            okno.baza.usunKsiazke(ksiazka);
            okno.setVisible(false);
            okno.dispose();
            new OknoGlowne().setVisible(true);
        });

        label = new JLabel("Przeczytane. Moja ocena:       ", SwingConstants.CENTER);
        label.setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        dx = 4;
        label.setBounds(0 + dx, 0 + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
        add(label);

        tekst = new JTextField();
        tekst.setFont(new Font("Serif", Font.BOLD, rozmiarCzcionki));
        tekst.setHorizontalAlignment(JTextField.CENTER);
        tekst.setBounds(400, 25, 50, 50);
        add(tekst);

        add(przycisk);

    }
}
