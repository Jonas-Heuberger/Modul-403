import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String unit = unit();
        int value = value();
        int result = calculate(value, unit);



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
public static int[] calculate(int value,String unit){
    String[] Längenmasse = new String[]{"mm", "cm", "dm", "m", "km"};
    int[] Längenmasse = new int[]{0, 10, 100, 1000, 1000000};
    String[] Hohlmasse = new String[] {"ml", "cl", "dl", "l", "hl"};
    int[] Hohlmasse = new int[]{0,10,100, 1000, 100000};
    

}
}
