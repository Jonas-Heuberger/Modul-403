public class main<ATMhunderter> {
    public static void main(String[] args) {
        int ATMt = berechneTausender(4321);
        int ATM2h = berechneZweiHunderter(ATMt);
        int ATMh = berechneHunderter(ATM2h);
        System.out.println(ATMt);
        System.out.println(ATM2h);
        System.out.println(ATMh);


    }

    private static int berechneTausender(int betrag) {
        int ATMtausender = 0;
        while (betrag > 1000) {
            betrag = betrag - 1000;
            ATMtausender++;
        }
        return ATMtausender;

    }

    private static int berechneZweiHunderter(int ATMt) {
        int AtmZweiunderter = 0;
        while (ATMt > 200) {
            ATMt = ATMt - 200;
            AtmZweiunderter++;
        }
        return AtmZweiunderter;
    }

    private static int berechneHunderter(int ATM2h) {
        int AtmHunderter = 0;
        while (ATM2h > 100) {
            ATM2h = ATM2h - 100;
            AtmHunderter++;
        }
        return AtmHunderter;
    }
}
