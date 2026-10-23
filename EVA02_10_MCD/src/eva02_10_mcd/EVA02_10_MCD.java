package eva02_10_mcd;

public class EVA02_10_MCD {

    public static void main(String[] args) {
        System.out.println("El MCD de 48 y 18 es: " + mcd(48, 18));
    }

    public static int mcd(int a, int b) {
        if ((a%b) == 0) {
            return b; // Caso base: el MCD de a y b es b si a es divisible por b
        } else {
            System.out.println(((int)(a%b)));
            return mcd(b, (a % b)); // Llamada recursiva
        }
    }
}
