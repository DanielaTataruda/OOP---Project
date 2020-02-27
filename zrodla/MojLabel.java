import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MojLabel extends JLabel {

    public MojLabel(String napis, int rozmiarCzcionki, boolean pogrubienie, String tytul, int x, int y, int szerokosc, int wysokosc)
    {
        super(napis, SwingConstants.CENTER);

        int dx = 2;
        if(tytul.equals(""))
        {
            setBorder(BorderFactory.createRaisedBevelBorder());
        }
        else
        {
            setBorder(BorderFactory.createTitledBorder(tytul));
        }
        setFont(new Font("Serif", (pogrubienie ? Font.BOLD : Font.PLAIN), rozmiarCzcionki));
        setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
    }

    public MojLabel(ImageIcon ikona, String tytul, int x, int y, int szerokosc, int wysokosc)
    {
        super(ikona, SwingConstants.CENTER);

        int dx = 2;
        if(tytul.equals(""))
        {
            dx = 5;
            setBorder(BorderFactory.createRaisedBevelBorder());
        }
        else
        {
            setBorder(BorderFactory.createTitledBorder(tytul));
        }
        setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
    }
}
