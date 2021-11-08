import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		amount = calculate(amount);
        printAmount(amount);
	}

	private static int calculate(int amount){
        int cal1;
        int cal2;
        int cal3;
		for (int i = 0; i<= 3; i++){
		    cal1 = amount / 100;
		    cal2 = cal1 * 10;
            cal3 = amount - cal2;
		}
		return cal3;
    
	}

    private static void printAmount(int amount){
        System.out.println(amount);
    }
}
