import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OknoGlowne extends Okno
{

    public OknoGlowne()
    {
        setLayout(null);

        MojLabel label = new MojLabel(new ImageIcon("../grafiki/obrazek3.png"), "", 0, 0, 800, 200);
        add(label);

        MojPrzycisk przycisk;

        przycisk = new MojPrzycisk("Baza książek", 2, 26, false, 0, 200, 400, 200);
        add(przycisk);

        przycisk = new MojPrzycisk("Książki do przeczytania", 3, 26, false, 400, 200, 400, 200);
        add(przycisk);

        przycisk = new MojPrzycisk("Książki czytane", 4, 26, false, 0, 400, 400, 200);
        add(przycisk);

        przycisk = new MojPrzycisk("Książki przeczytane", 5, 26, false, 400, 400, 400, 200);
        add(przycisk);
    }
}
