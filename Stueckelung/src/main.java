import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String unit = unit();
        int value = value();
        int result = calculate(value, unit);



        System.out.println("Hello, World!");
    }

    private static String unit(){
        Scanner scan = new Scanner(System.in);
        String unit = scan.nextLine();
        return unit;
    }

    
private static int value(){
    Scanner scan = new Scanner(System.in);
    int value = scan.nextInt();
    return value;
}
public static int calculate(int value,String unit){
    int[] Array = new int[]{0, 10, 100, 1000, 100000, 1000000};
    


}
}
