// Quelle: https://trainyourprogrammer.de/java-129-bestimmung-des-kleinsten-gemeinsamen-vielfachen-kgv.html

public class KGV {

        public static void KGV(){
            int zahl1 = 9;
            int zahl2 = 5;

            while (zahl1 != zahl2) {
                if (zahl1 < zahl2) {
                    zahl1 += 1;
                } else {
                    zahl2+= 2;
                }
            }

            System.out.println("KGV: "  + zahl1);

        }
    }

