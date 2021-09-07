import java.lang.Math;
import java.util.Random;
/**
 Potenzrechnen
 */
public class Potenzrechnen {           // Code von Geekforgeeks
    public static void Potenz() {
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        double potent = 2;
        System.out.println("Die 2er Potenz von " + rand_int + " ergibt");
        System.out.println(Math.pow(rand_int, potent));
    }

}
/*
        public static void Scanner(){             // YouTube Tutorial (Java Scanner Tutorial)
            Scanner sc = new Scanner(System.in);
            System.out.println(sc);
        }
*/



