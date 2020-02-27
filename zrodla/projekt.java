import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Projekt
{
	public static void main(String[] args)
    {
		/*
        BazaKsiazek bk = new BazaKsiazek();
		bk.dodajKsiazke(new Ksiazka("Dziewczna z pociągu", "Paula Hawkins", "kryminał", 328, 2016, "dziewczynazpociagu"));
		bk.dodajKsiazke(new Ksiazka("Przedwiośnie", "Stefan Żeromski", "powieść", 304, 2012, "przedwiosnie"));
		bk.dodajKsiazke(new Ksiazka("Krótka historia czasu", "Stephen Hawking", "astronomia", 296, 2015, "krotkahistoriaczasu"));
		bk.dodajKsiazke(new Ksiazka("We dwoje", "Nicholas Sparks", "romans", 544, 2017, "wedwoje"));
		bk.dodajKsiazke(new Ksiazka("Labirynt Duchów", "Carlos Ruiz Zafón", "literatura piękna", 896, 2017, "labiryntduchow"));
		bk.dodajKsiazke(new Ksiazka("Światło, które utraciliśmy", "Jill Santopolo", "romans", 304, 2017, "swiatloktoreutracilismy"));
		bk.dodajKsiazke(new Ksiazka("Never Never", "Colleen Hoover", "literatura młodzieżowa", 392, 2016, "nevernever"));
		bk.dodajKsiazke(new Ksiazka("Hopeless", "Colleen Hoover", "literatura młodzieżowa", 424, 2014, "hopeless"));
		bk.dodajKsiazke(new Ksiazka("Cień wiatru", "Carlos Ruiz Zafón", "literatura współczesna", 520, 2017, "cienwiatru"));
		bk.dodajKsiazke(new Ksiazka("Za zamkniętymi drzwiami", "B. A. Paris", "kryminał", 304, 2017, "zazamknietymidrzwiami"));
		bk.dodajKsiazke(new Ksiazka("Złodziejka książek", "Markus Zusak", "kryminał", 496, 2014, "zlodziejkaksiazek"));
		bk.dodajKsiazke(new Ksiazka("Rok 1984", "George Orwell", "powieść", 360, 2014, "rok1984"));
		bk.dodajKsiazke(new Ksiazka("Zabić drozda", "Nelle Harper Lee", "powieść", 424, 2015, "zabicdrozda"));
		bk.dodajKsiazke(new Ksiazka("Buszujący w zbożu", "Jerome David Salinger", "powieść", 304, 2016, "buszujacywzbozu"));
		bk.dodajKsiazke(new Ksiazka("Zielona Mila", "Stephen King", "kryminał", 416, 2008, "zielonamila"));
		bk.dodajKsiazke(new Ksiazka("Zostań, jeśli kochasz", "Gayle Forman", "literatura młodzieżowa", 248, 2014, "zostanjeslikochasz"));
		bk.dodajKsiazke(new Ksiazka("November 9", "Colleen Hoover", "literatura młodzieżowa", 336, 2016, "november9"));
		bk.dodajKsiazke(new Ksiazka("Maybe Someday", "Colleen Hoover", "literatura młodzieżowa", 440, 2015, "maybesomeday"));
		bk.dodajKsiazke(new Ksiazka("Metro 2033", "Dmitrij Głuchowski", "science fiction", 592, 2015, "metro2033"));
		bk.dodajKsiazke(new Ksiazka("Metro 2034", "Dmitrij Głuchowski", "science fiction", 410, 2015, "metro2034"));
		bk.dodajKsiazke(new Ksiazka("Metro 2035", "Dmitrij Głuchowski", "science fiction", 546, 2015, "metro2035"));
		bk.dodajKsiazke(new Ksiazka("Gra Anioła", "Carlos Ruiz Zafón", "literatura współczesna", 608, 2017, "graaniola"));
		bk.dodajKsiazke(new Ksiazka("Więzień nieba", "Carlos Ruiz Zafón", "literatura współczesna", 416, 2017, "wieziennieba"));
		bk.dodajKsiazke(new Ksiazka("Nie mów nikomu", "Harlan Coben", "kryminał", 384, 2018, "niemownikomu"));
		bk.dodajKsiazke(new Ksiazka("W domu", "Harlan Coben", "kryminał", 416, 2018, "wdomu"));
		bk.dodajKsiazke(new Ksiazka("Na gorącym uczynku", "Harlan Coben", "kryminał", 416, 2018, "nagoracymuczynku"));
		bk.dodajKsiazke(new Ksiazka("Bez skrupułów", "Harlan Coben", "kryminał", 384, 2018, "bezskrupulow"));
		bk.dodajKsiazke(new Ksiazka("Zostań przy mnie", "Harlan Coben", "kryminał", 416, 2018, "zostanprzymnie"));
		bk.dodajKsiazke(new Ksiazka("Sześć lat później", "Harlan Coben", "kryminał", 378, 2018, "szesclatpozniej"));
		bk.dodajKsiazke(new Ksiazka("Hobbit czyli tam i z powrotem", "J. R. R. Tolkien", "fantastyka", 320, 2014, "hobbit"));
		bk.dodajKsiazke(new Ksiazka("Niewinny", "Harlan Coben", "kryminał", 416, 2018, "niewinny"));
		bk.dodajKsiazke(new Ksiazka("Tęsknię za tobą", "Harlan Coben", "kryminał", 432, 2018, "teskniezatoba"));
		bk.dodajKsiazke(new Ksiazka("Ostatnie życzenie", "Andrzej Sapkowski", "fantastyka", 332, 2014, "ostatniezyczenie"));
		bk.dodajKsiazke(new Ksiazka("Miecz przeznaczenia", "Andrzej Sapkowski", "fantastyka", 400, 2014, "mieczprzeznaczenia"));
		bk.dodajKsiazke(new Ksiazka("Krew elfów", "Andrzej Sapkowski", "fantastyka", 340, 2014, "krewelfow"));
		bk.dodajKsiazke(new Ksiazka("Czas pogardy", "Andrzej Sapkowski", "fantastyka", 368, 2014, "czaspogardy"));
		bk.dodajKsiazke(new Ksiazka("Chrzest ognia", "Andrzej Sapkowski", "fantastyka", 382, 2014, "chrzestognia"));
		bk.dodajKsiazke(new Ksiazka("Wieża Jaskółki", "Andrzej Sapkowski", "fantastyka", 488, 2014, "wiezajaskolki"));
		bk.dodajKsiazke(new Ksiazka("Pani Jeziora", "Andrzej Sapkowski", "fantastyka", 596, 2014, "panijeziora"));
		bk.dodajKsiazke(new Ksiazka("Sezon burz", "Andrzej Sapkowski", "fantastyka", 596, 2014, "sezonburz"));
		bk.dodajKsiazke(new Ksiazka("Folwark zwierzęcy", "George Orwell", "powieść", 136, 2006, "folwarkzwierzecy"));
		bk.dodajKsiazke(new Ksiazka("Ania", "Maciej Drzewicki, Grzegorz Kubicki", "biografia", 384, 2017, "ania"));
		bk.dodajKsiazke(new Ksiazka("Chłopiec na szczycie góry", "John Boyne", "powieść historyczna", 272, 2017, "chlopiecnaszczyciegory"));
		bk.dodajKsiazke(new Ksiazka("Waleczna Czarownica", "Danielle L. Jensen", "fantastyka", 400, 2017, "walecznaczarownica"));
		bk.dodajKsiazke(new Ksiazka("Porwana pieśniarka", "Danielle L. Jensen", "fantastyka", 432, 2017, "porwanapiesniarka"));
		bk.dodajKsiazke(new Ksiazka("Ukryta łowczyni", "Danielle L. Jensen", "fantastyka", 500, 2017, "ukrytalowczyni"));
		bk.dodajKsiazke(new Ksiazka("Tamte dni, tamte noce", "André Aciman", "literatura piękna", 330, 2018, "tamtednitamtenoce"));
		bk.dodajKsiazke(new Ksiazka("Pożegnanie z Afryką", "Karen Blixen", "biografia", 424, 2009, "pozegnaniezafryka"));
		bk.dodajKsiazke(new Ksiazka("Wszystko za życie", "Jon Krakauer", "biografia", 192, 2008, "wszystkozazycie"));
		bk.dodajKsiazke(new Ksiazka("Lot nad kukułczym gniazdem", "Ken Kesey", "biografia", 368, 2015, "lotnadkukulczymgniazdem"));
		*/

        EventQueue.invokeLater(() ->
        {
            Okno m = new OknoGlowne();
        });
    }
}
