import java.sql.Array;
import java.util.Arrays;

public class AR_5_1 {
    public static void main(String[] args) {
        int suma = 0;
        int[] randomNums = new int[10];
        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random()*101);
            randomNums[i] = random;
            suma += randomNums[i];
        }
        System.out.println("Taula: " + Arrays.toString(randomNums));
        System.out.println("Suma de la taula: " + suma);
    }
}