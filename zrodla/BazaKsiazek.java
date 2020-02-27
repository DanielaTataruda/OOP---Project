import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BazaKsiazek implements Serializable
{
    protected transient ArrayList < Ksiazka > lista;
    protected String nazwa = "bazaksiazek";

    public BazaKsiazek()
    {
        czytaj();
    }

    public void dodajKsiazke(Ksiazka k)
    {
        lista.add(k);
        zapisz();
    }

    public Ksiazka wezKsiazke(int indeks)
    {
        return lista.get(indeks);
    }

    public ArrayList < Ksiazka > wezListe()
    {
        return lista;
    }

    public void usunKsiazke(Ksiazka k)
    {
        lista.remove(k);
        zapisz();
    }

    public void zapisz()
    {
        try(ObjectOutputStream strumienWyjscia = new ObjectOutputStream(new FileOutputStream("../zapis/" + nazwa + ".bin"))) 
        {
            strumienWyjscia.writeObject(lista);
            strumienWyjscia.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void czytaj()
    {
        try
        {
            File plik = new File("../zapis/" + nazwa + ".bin");
            if(plik.exists() && !plik.isDirectory())
            {
                ObjectInputStream strumienWejscia = 
                    new ObjectInputStream(new BufferedInputStream(new FileInputStream("../zapis/" + nazwa + ".bin")));
                lista = (ArrayList<Ksiazka>)strumienWejscia.readObject();
                strumienWejscia.close();
            }
            else
            {
                lista = new ArrayList < Ksiazka > ();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() 
    {
        String out = "Baza ksiazek:\n";
        for(Ksiazka k: lista)
        {
            out += k.toString() + "\n";
        }
        return out;
    }
}