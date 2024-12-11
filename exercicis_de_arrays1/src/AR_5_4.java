public class AR_5_4 {
    public static void main(String[] args) {
        int[] t = {13,24,56,43,2,44,3,67};
        System.out.println("El valor mes alt de la taula es: " + maxim(t));
    }
    static int maxim(int t[]) {
        int num = 0;
        for (int i = 0; i < t.length; i++) {
            if (num < t[i]) {
                num = t[i];
            }
        }
        return num;
    }
}