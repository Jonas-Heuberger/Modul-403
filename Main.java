class Main {
  public static void main(String[] args) {
    //KGV.KGV();
    //GGT.GGT();

    System.out.println("Schreibe Betrag "); // Abfrage des Betrages
    double Betrag = MWST.Abfrage(); // Definiere Abfrage der Zahl als Betrag

    System.out.println("Schreibe MWST Satz "); // Abfrage des MWST Satzes
    double MwstSatz = MWST.Abfrage(); // Definiere Abfrage der Zahl als MWST Satz


    double Resultat = MWST.BerechneMwst(Betrag, MwstSatz); // Definiere Resultat als Ausgabe der Berechnungs Funktion
    MWST.Ausgabe(Resultat, Betrag); // Gebe Resultat aus


    //MWST.MWST();

   // Potenzrechnen.GenerateRandom();

   // Potenzrechnen.Scanner();
    // Variables.Name("John");
// Aufruf der Funktion Ausgeben

  /*  for (int zähler = 0; zähler < 10; zähler++ ) { // zähler = zähler +1
      Ausgeben("Hello World");
    }


    Potenzrechnen.Potenz();
}
  /*
  Ziel: Ausgabe des Texts (Parameter)
  Parameter: Auszugebender Text
  Rückgabe: keine

  public static void Ausgeben(String AusgabeText) {
    System.out.println(AusgabeText);
  }
}
*/
  }
}