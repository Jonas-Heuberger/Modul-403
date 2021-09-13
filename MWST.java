import java.util.Scanner; // Importiere Scanner für Abfragen
public class MWST{

    public static double Abfrage(){ // Methode zur Abrage einer Zahl (kein Void!!!)
        Scanner scan = new Scanner(System.in);

        double Zahl = scan.nextDouble();
        return Zahl; // gebe Zahl zurück

    }

    public static double BerechneMwst(double Betrag, double MwstSatz){ // Betrag und MwstSatz aus der Abfrage Methode
        double Prozent = Betrag / 100; // 1% wird berechnet
        double Resultat = Prozent * MwstSatz; // Resultat wird berechnet
        return Resultat; // Resultat wird zurück gegeben
    }

    public static void Ausgabe(double Resultat, double Betrag){ // Resultat und Betrag für Ausgabe

        System.out.println("Die MWST von " + Betrag + ".- beträgt " + Resultat + "%");
    }
}


/* Scanner scan = new Scanner(System.in);

        System.out.println("Wie hoch ist der Betrag? ");

        double Betrag = scan.nextDouble();

        System.out.println("Wie hoch ist der MWST Satz? ");

        double MwstSatz = scan.nextDouble();*/



        /*double Prozent = Betrag / 100;
        double Resultat = Prozent * MwstSatz;*/
