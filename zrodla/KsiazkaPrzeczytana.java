import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class KsiazkaPrzeczytana extends Ksiazka implements Serializable
{
    protected Date data;
    protected int ocena;

    public KsiazkaPrzeczytana(String tytul, String autor, String gatunek, int liczbaStron, int rokWydania, String okladka, int ocena)
    {
        super(tytul, autor, gatunek, liczbaStron, rokWydania, okladka);

        data = new Date();
        this.ocena = ocena;
    }

    public KsiazkaPrzeczytana(Ksiazka ksiazka, int ocena)
    {
        super(ksiazka);

        data = new Date();
        this.ocena = ocena;
    }

    public int godzina()
    {
        return data.getHours();
    }

    public int minuta()
    {
        return data.getMinutes();
    }

    public int dzien()
    {
        return data.getDate();
    }

    public String miesiac()
    {
        String tablica[] = {"stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "września", "października", "listopada", "grudnia"};
        return tablica[data.getMonth()];
    }

    public int rok()
    {
        return data.getYear() + 1900;
    }

    public String data()
    {

        if(minuta() >= 0 && minuta() <= 9)
        {
            return dzien() + " " + miesiac() + " " + rok() + ", " + godzina() + ":" + "0"+ minuta();
        }
        else
        {
            return dzien() + " " + miesiac() + " " + rok() + ", " + godzina() + ":" + minuta();
        }
    }

    public int ocena()
    {
        return ocena;
    }
}
