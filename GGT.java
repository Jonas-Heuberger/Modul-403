// Euklidischer Algorithmus
// Quelle: https://www.youtube.com/watch?v=1h8xb34T99Y

public class GGT {
    public static void GGT(){
        int Zahl1, Zahl2, Grössere_Zahl, Kleinere_Zahl, Rest; // hier wird für alle Variablen der Datentyp festgelegt

        Zahl1 = 5;
        Zahl2 = 10;

        if (Zahl1 >= Zahl2){
            Grössere_Zahl = Zahl1;
            Kleinere_Zahl = Zahl2;
        }else{
            Grössere_Zahl = Zahl2;
            Kleinere_Zahl = Zahl1;
        }
        Rest = Grössere_Zahl % Kleinere_Zahl;

        while (Rest != 0){
            Grössere_Zahl = Kleinere_Zahl;
            Kleinere_Zahl = Rest;
            Rest = Grössere_Zahl % Kleinere_Zahl;
        }

        System.out.println("GGT von " + Zahl1 + " und " + Zahl2 + " ist " + Kleinere_Zahl);




    }
}
