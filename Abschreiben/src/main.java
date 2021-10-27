import java.util.Scanner;

public class main {
    public static void main(String[] args)  {

        double betrag = Abfrage();

    }
    private static double Abfrage(){ 
        Scanner scan = new Scanner(System.in);
        double Zahl = scan.nextDouble();
        return Zahl; 
    }

    }

