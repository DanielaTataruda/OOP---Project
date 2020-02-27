import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel 
{
    public Panel() {}

    protected void dodajKomponent(Component komponent, int x, int y, int szerokosc, int wysokosc) 
    {
        int dx = 2;
        komponent.setBounds(x + dx, y + dx, szerokosc - 2 * dx, wysokosc - 2 * dx);
        add(komponent);
    }
}
