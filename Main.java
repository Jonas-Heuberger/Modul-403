class Main {
  public static void main(String[] args) {

   // Potenzrechnen.GenerateRandom();

   // Potenzrechnen.Scanner();
    Variables.Name("John");
// Aufruf der Funktion Ausgeben

    for (int zähler = 0; zähler < 10; zähler++ ) { // zähler = zähler +1
      Ausgeben("Hello World");
    }


    Potenzrechnen.Potenz();
}
  /*
  Ziel: Ausgabe des Texts (Parameter)
  Parameter: Auszugebender Text
  Rückgabe: keine
   */
  public static void Ausgeben(String AusgabeText) {
    System.out.println(AusgabeText);
  }
}

