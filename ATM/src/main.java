import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein: ");
        int betrag = Abfrage();
        berechenen(betrag);

        /*
        int ATMt = berechneTausender(betrag);
        int ATM2h = berechneZweiHunderter(ATMt);
        int ATMh = berechneHunderter(ATM2h);
        int ATMf = berechneFünfziger(ATMh);
        int ATMz = berechneZwanziger(ATMf);
        int ATMze = berechneZehner(ATMz);
        int ATM5 = berechneFünfer(ATMze);
        int ATMzw = berechneZeier(ATM5);
        berechneEiner(ATMzw);

*/

    }
    private static int Abfrage() {
        Scanner scan = new Scanner(System.in);
        int Zahl = scan.nextInt();
        return Zahl; // gebe Zahl zurück

    }
    /*
    private static int berechneTausender(int betrag) {
        int ATMtausender = 0;
        while (betrag >= 1000) {
            betrag = betrag - 1000;
            ATMtausender++;
        }
        System.out.println("Tausender: " + ATMtausender);
        return betrag;

    }

    private static int berechneZweiHunderter(int ATMt) {
        int AtmZweiunderter = 0;
        while (ATMt >= 200) {
            ATMt = ATMt - 200;
            AtmZweiunderter++;
        }
        System.out.println("Zweihunderter: " + AtmZweiunderter);
        return ATMt;
    }

    private static int berechneHunderter(int ATM2h) {
        int AtmHunderter = 0;
        while (ATM2h >= 100) {
            ATM2h = ATM2h - 100;
            AtmHunderter++;
        }
        System.out.println("Hunderter: " + AtmHunderter);
        return ATM2h;
    }
    private static int berechneFünfziger(int ATMh){
        int AtmFünfziger = 0;
        while (ATMh >= 50){
            ATMh = ATMh - 50;
            AtmFünfziger++;
        }
        System.out.println("Fünfziger: " + AtmFünfziger);
        return ATMh;
    }
    private static int berechneZwanziger(int ATMf){
        int AtmZwanziger = 0;
        while ( ATMf >= 20){
            ATMf = ATMf - 20;
            AtmZwanziger++;
        }
        System.out.println("Zwanziger: " + AtmZwanziger);
        return ATMf;
    }
    private static int berechneZehner(int ATMz){
        int AtmZehner = 0;
        while (ATMz >= 10){
            ATMz = ATMz - 10;
            AtmZehner++;
        }
        System.out.println("Zehner: " + AtmZehner);
        return ATMz;
    }
    private static int berechneFünfer(int ATMze){
        int AtmFünfer = 0;
        while (ATMze >= 10){
            ATMze = ATMze - 5;
            AtmFünfer++;
        }
        System.out.println("Fünfer: " + AtmFünfer);
        return ATMze;

    }
    private static int berechneZeier(int ATM5){
        int AtmZweier = 0;
        while (ATM5 >= 2){
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
    */

    private static void berechenen(int betrag){
        int Tausender = 0;
        int Zweihunderter = 0;
        int Hunderter = 0;
        int Fünfziger = 0;
        int Zwanziger = 0;
        int Zehner = 0;
        int Fünfer = 0;
        int Zweier = 0;
        int Einer = 0;
        while (betrag >= 1000){
            betrag = betrag - 1000;
            Tausender++;
        }while (betrag >= 200){
            betrag = betrag - 200;
            Zweihunderter++;
        }while (betrag >= 100){
            betrag = betrag - 100;
            Hunderter++;
        }while (betrag >= 50){
            betrag = betrag - 50;
            Fünfziger++;
        }while (betrag >= 20) {
            betrag = betrag - 20;
            Zwanziger++;
        }while (betrag >= 10){
            betrag = betrag - 10;
            Zehner++;
        }while (betrag >= 5){
            betrag = betrag - 5;
            Fünfer++;
        }while (betrag >= 2){
            betrag = betrag - 2;
            Zweier++;
        }while (betrag >= 1){
            betrag = betrag - 1;
            Einer++;
        }
        System.out.println("Tausender: " + Tausender);
        System.out.println("Zweihunderter: " + Zweihunderter);
        System.out.println("Hunderter: " + Hunderter);
        System.out.println("Fünfziger: " + Fünfziger);
        System.out.println("Zwanziger: " + Zwanziger);
        System.out.println("Zehner: " + Zehner);
        System.out.println("Fünfer: " + Fünfer);
        System.out.println("Zweier:  " + Zweier);
        System.out.println("Einer: " + Einer);
    }

}
