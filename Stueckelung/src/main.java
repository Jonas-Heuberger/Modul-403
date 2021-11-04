import java.util.Scanner;

public class main {
    public static final int  ANZAHL_EINHEITEN = 5;

    public static String Einheiten[];
    public static int Faktoren[];
    public static int Loesung[] = new int[ANZAHL_EINHEITEN];

    public static void main(String[] args) {
        System.out.println("Umrechner gestartet");

        //Eingaben
        int anzahl = LesenAnzahl();
        String einheit = LesenEinheit();

        //Ermitteln der Position im korrekten Array
        int position = CalcArrays(einheit);

        //Ermitteln des Basiswertes
        int basis = CalcBasis(anzahl, position);

        //Aufteilen
        CalcSplitting(basis);

        //Ausgeben
        OutputSplitting();
    }

    public static int LesenAnzahl()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welche Zahl soll umgerechnet werden?");
        int zahl = scanner.nextInt();
        return zahl;
    }

    public static String LesenEinheit()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welche Masseinheit soll umgerechnet werden?");
        String einheit = scanner.nextLine();
        return einheit;
    }

    public static int CalcArrays(String einheit)
    {
        String[] einheitenLaengen = new String[]{"mm", "cm", "dm", "m", "km"};
        int[] faktorenLaengen = new int[]{ 1, 10, 100, 1000, 1000000 };
        String[] einheitenHohl = new String[]{"ml", "cl", "dl", "l", "hl"};
        int[] faktorenHohl = new int[]{ 1, 10, 100, 1000, 100000 };
        String[] einheitenGewicht = new String[]{"mg", "g", "kg", "c", "t"};
        int[] faktorenGewicht = new int[]{ 1, 1000, 1000000, 1000000000, 1000000000 };
        for (int i = 0; i < ANZAHL_EINHEITEN; i++)
        {
            if (einheitenLaengen[i].equals(einheit))
            {
                Faktoren = faktorenLaengen;
                Einheiten = einheitenLaengen;
                return i;
            }

            if (einheitenHohl[i].equals(einheit))
            {
                Faktoren = faktorenHohl;
                Einheiten = einheitenHohl;
                return i;
            }
            if (einheitenGewicht[i].equals(einheit))
            {
                Faktoren = faktorenGewicht;
                Einheiten = einheitenGewicht;
                return i;
            }

        }

        System.out.println("Masseinheit unbekannt");
        System.exit(0);
        return -1;
    }

    public static int CalcBasis(int anzahl, int position)
    {
        int faktor = Faktoren[position];
        return anzahl * faktor;
    }

    public static void CalcSplitting(int basis)
    {
        int rest = basis;
        for (int i = ANZAHL_EINHEITEN-1; i>=0; i--)
        {
            Loesung[i] = rest / Faktoren[i];
            rest = rest % Faktoren[i];

            if (rest == 0)
                break;
        }
    }

    public static void OutputSplitting()
    {
        for (int i = ANZAHL_EINHEITEN-1; i>=0; i--)
        {
            System.out.println(Einheiten[i] + ": " + Loesung[i]);
        }
    }
}