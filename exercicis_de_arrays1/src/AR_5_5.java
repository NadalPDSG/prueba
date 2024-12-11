import java.util.Arrays;
import java.util.Scanner;

public class AR_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la longitud que tindra l'array: ");
        int longitud = sc.nextInt();
        System.out.print("Introdueix el maxim del numero aleatori par: ");
        int fi = sc.nextInt();
        System.out.println(Arrays.toString(ompleParells(longitud,fi)));
    }
    static int[] ompleParells(int longitud, int fi) {
        int[] randomArray = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            int randomNum = 1;
            while (randomNum%2 != 0) {
                randomNum = (int)(Math.random() * (fi - 2) + 2);;
            }
            randomArray[i] = randomNum;
        }
        Arrays.sort(randomArray);
        return randomArray;
    }
}