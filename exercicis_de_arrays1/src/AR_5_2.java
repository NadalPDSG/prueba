import java.util.Scanner;

public class AR_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNegatiu = 0;
        int numN = 0;
        int numPositiu = 0;
        int numP = 0;
        int zero = 0;
        System.out.print("Introdueix la quantitat de numeros que voleu introduir:");
        int n = sc.nextInt();
        int[] arrayNum = new int[n];
        System.out.println("Introdueix els numeros:");
        for (int i = 0; i < arrayNum.length; i++) {
            int num = sc.nextInt();
            arrayNum[i] = num;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > 0) {
                numP += 1;
                numPositiu += arrayNum[i];
            } else if (arrayNum[i] < 0) {
                numN += 1;
                numNegatiu += arrayNum[i];
            } else if (arrayNum[i] == 0) {
                zero += 1;
            }
        }
        int mitjaPositiu = numPositiu / numP;
        int mitjaNegatiu = numNegatiu / numN;

        System.out.println("Mitja positius: " + mitjaPositiu);
        System.out.println("Mitja negatus: " + mitjaNegatiu);
        System.out.println("Nombre de zeros: " + zero);
    }
}