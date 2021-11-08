import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here
		amount = calculate(amount);
		System.out.println(amount);
	}

	public static int calculate(int amount){
		for (int i = 0; i<= 3; i++){
		    int cal1 = amount / 100;
		    int cal2 = cal1 * 100;
		    int cal3 = amount - cal2;
		}
		return cal3;
	}
}
