class Main {
  public static void main(String[] args) {

// Aufruf der Funktion Ausgeben

    for (int zähler = 0; zähler < 10; zähler++) {
      Ausgeben("Hello World");
    }
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