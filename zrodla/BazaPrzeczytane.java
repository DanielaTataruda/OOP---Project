import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BazaPrzeczytane extends BazaKsiazek implements Serializable
{
    public BazaPrzeczytane()
    {
        nazwa = "bazaprzeczytane";
        czytaj();
    }
}