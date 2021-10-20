import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein: ");
        Scanner scan = new Scanner(System.in);
        int num = sum(scan.nextInt());
        sum(num);
        System.out.println(num);

    }
    public static int sum(int num) {
        while (num >= 10) {
            int modulo = num % 10;
            int division = num / 10;
            num = modulo + division;
            sum(num);
        }
        return num;
    }

}
