
package eva02_11_fibonacci;

public class EVA02_11_FIBONACCI {

    public static void main(String[] args) {
        System.out.println("La posicion 10 de Fibonacci es: " + fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
