import java.lang.Math; // Geek for Geeks
import java.util.Random; // Geek for Geekspublic
class main {public static void main(String[] args) {
        Potenz();
    }


        public static void Potenz() {
            Random rand = new Random();
            int rand_int = rand.nextInt(100);
            int potenz = 2;
            System.out.println("Die 2er Potenz von " + rand_int + " ergibt:");
            System.out.println(Math.pow(rand_int, potenz));
        }


}
