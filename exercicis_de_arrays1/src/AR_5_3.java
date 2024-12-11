import java.util.Arrays;
import java.util.Scanner;

public class AR_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la quantitat de numeros que voleu introduir: ");
        int n = sc.nextInt();
        int[] arrayNum = new int[n];
        System.out.println("Introdueix els numeros:");
        for (int i = 0; i < arrayNum.length; i++) {
            int num = sc.nextInt();
            arrayNum[i] = num;
        }
        System.out.print("Numeros invertits: ");
        for (int i = arrayNum.length-1; i > -1; i--) {
            System.out.print(arrayNum[i]+"  ");
        }
    }
}