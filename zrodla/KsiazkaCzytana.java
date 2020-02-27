import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KsiazkaCzytana extends Ksiazka implements Serializable
{
    protected int aktualniePrzeczytane;

    public KsiazkaCzytana(String tytul, String autor, String gatunek, int liczbaStron, int rokWydania, String okladka)
    {
        super(tytul, autor, gatunek, liczbaStron, rokWydania, okladka);
        aktualniePrzeczytane = 0;
    }

    public KsiazkaCzytana(Ksiazka ksiazka)
    {
        super(ksiazka);
        aktualniePrzeczytane = 0;
    }

    public void ustawStrony(int strony)
    {
        if(strony < 0 || strony > liczbaStron) return;
        aktualniePrzeczytane = strony;
    }

    public int wezStrony()
    {
        return aktualniePrzeczytane;
    }

    public int postep()
    {
        return 100 * aktualniePrzeczytane / liczbaStron;
    }
}