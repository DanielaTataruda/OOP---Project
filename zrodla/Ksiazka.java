import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ksiazka implements Serializable
{
    protected String tytul;
    protected String autor;
    protected String gatunek;
    protected int liczbaStron;
    protected int rokWydania;
    public String okladka;

    public Ksiazka(String tytul, String autor, String gatunek, int liczbaStron, int rokWydania, String okladka)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
        this.liczbaStron = liczbaStron;
        this.rokWydania = rokWydania;
        this.okladka = okladka;
    }

    public Ksiazka(Ksiazka k)
    {
        this.tytul = k.tytul();
        this.autor = k.autor();
        this.gatunek = k.gatunek();
        this.liczbaStron = k.liczbaStron();
        this.rokWydania = k.rokWydania();
        this.okladka = k.nazwaOkladki();
    }

    public ImageIcon okladka()
    {
        ImageIcon ikona = new ImageIcon("../grafiki/" + okladka + ".png");
        Image obraz = ikona.getImage();
        int sz = 170, wy = 270, sz1 = obraz.getWidth(null), wy1 = obraz.getHeight(null);
        if((double)sz1 / (double)sz < (double)wy1 / (double)wy)
        {
            sz1 = (int)((double)sz1 * (double)wy / (double)wy1);
            wy1 = wy;
        }
        else
        {
            wy1 = (int)((double)wy1 * (double)sz / (double)sz1);
            sz1 = sz;
        }
        Image nowyObraz = obraz.getScaledInstance(sz1, wy1, java.awt.Image.SCALE_SMOOTH);
        ikona = new ImageIcon(nowyObraz);
        return ikona;
    }

    public String tytul()
    {
        return tytul;
    }

    public String autor()
    {
        return autor;
    }

    public String gatunek()
    {
        return gatunek;
    }

    public int liczbaStron()
    {
        return liczbaStron;
    }

    public int rokWydania()
    {
        return rokWydania;
    }

    public String nazwaOkladki()
    {
        return okladka;
    }

    @Override
    public String toString() 
    {
        return tytul;
    }
}