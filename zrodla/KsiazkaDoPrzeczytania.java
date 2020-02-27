import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KsiazkaDoPrzeczytania extends Ksiazka implements Serializable
{
    public KsiazkaDoPrzeczytania(String tytul, String autor, String gatunek, int liczbaStron, int rokWydania, String okladka)
    {
        super(tytul, autor, gatunek, liczbaStron, rokWydania, okladka);
    }
}