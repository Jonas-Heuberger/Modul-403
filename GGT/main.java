public class main {
    public static void main(String[] args) {
        GGT();

    }
    // Euklidischer Algorithmus
//
        public static void GGT(){
            int Zahl1, Zahl2, Grössere_Zahl, Kleinere_Zahl, Rest;
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

