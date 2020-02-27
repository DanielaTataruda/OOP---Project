import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PanelKsiazki extends Panel
{
    public Ksiazka ksiazka;

    public PanelKsiazki(Ksiazka ksiazka)
    {
        this.ksiazka = ksiazka;

        setLayout(null);
        //setBackground(Color.WHITE);

        JLabel label;
        Border border;

        label = new MojLabel(ksiazka.okladka(), "Okładka", 0, 0, 200, 300);
        add(label);

        label = new MojLabel(ksiazka.tytul(), 30, true, "Tytuł", 200, 0, 400, 80);
        add(label);

        label = new MojLabel(ksiazka.autor(), 25, false, "Autor", 200, 80, 400, 70);
        add(label);

        label = new MojLabel(ksiazka.gatunek(), 20, false, "Gatunek", 200, 150, 400, 50);
        add(label);

        label = new MojLabel("" + ksiazka.liczbaStron(), 20, false, "Liczba stron", 200, 200, 400, 50);
        add(label);

        label = new MojLabel("" + ksiazka.rokWydania(), 20, false, "Rok wydania", 200, 250, 400, 50);
        add(label);

        MojPrzycisk przycisk = new MojPrzycisk("Menu", 1, 20, false, 0, 500, 600, 100);
        add(przycisk);
    }

    public void dodajPrzyciskiSpecjalne()
    {
        OknoKsiazki okno = (OknoKsiazki)SwingUtilities.getWindowAncestor(this);

        if(okno.baza instanceof BazaPrzeczytane)
        {
            MojLabel specjalny1 = new MojLabel("" + ((KsiazkaPrzeczytana)ksiazka).ocena(), 30, true, "Moja ocena", 0, 300, 600, 100);
            add(specjalny1);

            MojLabel specjalny2 = new MojLabel(((KsiazkaPrzeczytana)ksiazka).data(), 20, true, "Data przeczytania", 0, 400, 600, 100);
            add(specjalny2);
        }
        else if(okno.baza instanceof BazaCzytane)
        {
            PrzyciskPostep specjalny1 = new PrzyciskPostep(ksiazka, 20, false, 0, 300, 600, 100);
            add(specjalny1);

            PrzyciskPrzeczytane specjalny2 = new PrzyciskPrzeczytane(ksiazka, 20, false, 0, 400, 600, 100);
            add(specjalny2);
        }
        else if(okno.baza instanceof BazaDoPrzeczytania)
        {
            JButton specjalny1 = new PrzyciskCzytam(ksiazka, 20, false, 0, 300, 600, 100);
            add(specjalny1);

            PrzyciskPrzeczytane specjalny2 = new PrzyciskPrzeczytane(ksiazka, 20, false, 0, 400, 600, 100);
            add(specjalny2);
        }
        else
        {
            JButton specjalny1 = new PrzyciskChcePrzeczytac(ksiazka, 20, false, 0, 300, 600, 100);
            add(specjalny1);

            JButton specjalny2 = new PrzyciskCzytam(ksiazka, 20, false, 0, 400, 600, 100);
            add(specjalny2);
        }
    }
}
