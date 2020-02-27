import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PrzyciskPostep extends JPanel {

    private JButton przycisk;
    private JTextField tekst;
    private JLabel label;

    public PrzyciskPostep(Ksiazka ksiazka, int rozmiarCzcionki, boolean pogrubienie, int x, int y, int szerokosc, int wysokosc) 
    {
        setLayout(null);
        setBounds(x, y, szerokosc, wysokosc);

        int dx = 2;

        przycisk = new JButton();
        przycisk.setBounds(0 + dx, 0 + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
        przycisk.addActionListener((ActionEvent e) -> 
        {
            ((KsiazkaCzytana)ksiazka).ustawStrony(Integer.parseInt(tekst.getText()));
            label.setText("Liczba przeczytanych stron:              . Postęp: " + ((KsiazkaCzytana)ksiazka).postep() + "%.");
            OknoKsiazki okno = (OknoKsiazki)SwingUtilities.getWindowAncestor(this);
            okno.baza.zapisz();
        });

        label = new JLabel("Liczba przeczytanych stron:             . Postęp: " + ((KsiazkaCzytana)ksiazka).postep() + "%.", SwingConstants.CENTER);
        label.setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        dx = 4;
        label.setBounds(0 + dx, 0 + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
        add(label);

        tekst = new JTextField("" + ((KsiazkaCzytana)ksiazka).wezStrony());
        tekst.setFont(new Font("Serif", Font.BOLD, rozmiarCzcionki));
        tekst.setHorizontalAlignment(JTextField.CENTER);
        tekst.setBounds(335, 25, 50, 50);
        add(tekst);

        add(przycisk);

    }
}
