import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein: ");
        int betrag = Abfrage();
        berechenen(betrag);

    }
    private static int Abfrage() {
        Scanner scan = new Scanner(System.in);
        int Zahl = scan.nextInt();
        return Zahl;
    }

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
