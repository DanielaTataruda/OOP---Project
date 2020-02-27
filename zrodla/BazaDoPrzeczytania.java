import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BazaDoPrzeczytania extends BazaKsiazek implements Serializable
{
    public BazaDoPrzeczytania()
    {
        nazwa = "bazadoprzeczytania";
        czytaj();
    }
}