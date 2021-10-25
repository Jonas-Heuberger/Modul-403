import java.util.Scanner;

public class main<ATMhunderter> {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein: ");
        int betrag = Abfrage();
        int ATMt = berechneTausender(betrag);
        int ATM2h = berechneZweiHunderter(ATMt);
        int ATMh = berechneHunderter(ATM2h);
        int ATMf = berechneFünfziger(ATMh);
        int ATMz = berechneZwanziger(ATMf);
        int ATMze = berechneZehner(ATMz);
        int ATM5 = berechneFünfer(ATMze);
        int ATMzw = berechneZeier(ATM5);
        berechneEiner(ATMzw);



    }
    private static int Abfrage() {
        Scanner scan = new Scanner(System.in);
        int Zahl = scan.nextInt();
        return Zahl; // gebe Zahl zurück

    }
    private static int berechneTausender(int betrag) {
        int ATMtausender = 0;
        while (betrag > 1000) {
            betrag = betrag - 1000;
            ATMtausender++;
        }
        System.out.println("Tausender: " + ATMtausender);
        return betrag;

    }

    private static int berechneZweiHunderter(int ATMt) {
        int AtmZweiunderter = 0;
        while (ATMt > 200) {
            ATMt = ATMt - 200;
            AtmZweiunderter++;
        }
        System.out.println("Zweihunderter: " + AtmZweiunderter);
        return ATMt;
    }

    private static int berechneHunderter(int ATM2h) {
        int AtmHunderter = 0;
        while (ATM2h > 100) {
            ATM2h = ATM2h - 100;
            AtmHunderter++;
        }
        System.out.println("Hunderter: " + AtmHunderter);
        return ATM2h;
    }
    private static int berechneFünfziger(int ATMh){
        int AtmFünfziger = 0;
        while (ATMh > 50){
            ATMh = ATMh - 50;
            AtmFünfziger++;
        }
        System.out.println("Fünfziger: " + AtmFünfziger);
        return ATMh;
    }
    private static int berechneZwanziger(int ATMf){
        int AtmZwanziger = 0;
        while ( ATMf > 20){
            ATMf = ATMf - 20;
            AtmZwanziger++;
        }
        System.out.println("Zwanziger: " + AtmZwanziger);
        return ATMf;
    }
    private static int berechneZehner(int ATMz){
        int AtmZehner = 0;
        while (ATMz > 10){
            ATMz = ATMz - 10;
            AtmZehner++;
        }
        System.out.println("Zehner: " + AtmZehner);
        return ATMz;
    }
    private static int berechneFünfer(int ATMze){
        int AtmFünfer = 0;
        while (ATMze > 10){
            ATMze = ATMze - 5;
            AtmFünfer++;
        }
        System.out.println("Fünfer: " + AtmFünfer);
        return ATMze;

    }
    private static int berechneZeier(int ATM5){
        int AtmZweier = 0;
        while (ATM5 > 2){
            ATM5 = ATM5 - 2;
            AtmZweier++;
        }
        System.out.println("Zweier: " + AtmZweier);
        return ATM5;
    }
    private static void berechneEiner(int ATMzw){
        int AtmEiner = 0;
        while (ATMzw >= 1){
            ATMzw = ATMzw - 1;
            AtmEiner++;
        }
        System.out.println("Einer: " + AtmEiner);
    }

}
