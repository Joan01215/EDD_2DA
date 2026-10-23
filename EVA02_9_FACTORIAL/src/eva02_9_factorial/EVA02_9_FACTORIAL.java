package eva02_9_factorial;

public class EVA02_9_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + factorialCiclo(5));
    }
    public static int factorialCiclo(int valor){
        int resu = 1;
        for (int i = 1; i <= 10; i++) {
            resu *= i;
            
        }
        return resu;
    }
    public static int factorialRecu(int valor){
        if( valor == 0)
            return 1;
        else
            return valor*factorialRecu(valor-1);
            
        }
    }
    

