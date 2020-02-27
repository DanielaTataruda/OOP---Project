import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OknoKsiazki extends Okno {

    public BazaKsiazek baza;
    private JPanel panel;
    private JList lista;
    private JScrollPane panel2;
    private int dx = 2;

    public OknoKsiazki(BazaKsiazek baza) 
    {
        super();
        setLayout(null);
        this.baza = baza;
        //setBackground(Color.WHITE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(new MojPrzycisk("Menu", 1, 20, false, 0, 500, 600, 100));
        panel.setBounds(200, 0, 600, 600);
        add(panel);
        
        lista = new JList(baza.wezListe().toArray(new Ksiazka[0]));
        
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        MouseListener sluchaczMyszy = new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                Ksiazka ksiazka = (Ksiazka)lista.getSelectedValue();
                if(ksiazka != null)
                {
                    zaktualizuj(ksiazka);
                }
            }
        };

        lista.addMouseListener(sluchaczMyszy);

        panel2 = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel2.setBounds(0 + dx, 0 + dx, 200 - 2 * dx, 600 - 2 * dx);
        add(panel2);
    }

    void zaktualizuj(Ksiazka ksiazka)
    {
        remove(panel);
        panel = new PanelKsiazki(ksiazka);  
        panel.setBounds(200, 0, 600, 600);          
        add(panel);
        ((PanelKsiazki)panel).dodajPrzyciskiSpecjalne();
        repaint();
    }
}
