// Manuel Matteo Capretta

public class KGV {
    public static void KGV() {
        int num1 = 5;
        int num2 = 8;
        int start;

        //Check if one of the given numbers is 0
        if (num1 > 0 && num2 > 0) {

            //Start the for loop with the bigger number
            if (num1 > num2) {
                start = num1;
            } else {
                start = num2;
            }

            //Check for the smallest number that is divisible by num1 and num2
            for (int i = start; i <= num1 * num2; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    System.out.println("KGV: " + i);
                    break;
                }
            }
        } else {
            System.out.println("KGV: 0\n");
        }
    }
}

