import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BazaCzytane extends BazaKsiazek implements Serializable
{
    public BazaCzytane()
    {
        nazwa = "bazaczytane";
        czytaj();
    }
}