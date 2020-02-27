import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame {

    public Okno() 
    {
        setTitle("Niezbędnik czytelnika");
        int blad = 21;
        setSize(800, 600 + blad);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
