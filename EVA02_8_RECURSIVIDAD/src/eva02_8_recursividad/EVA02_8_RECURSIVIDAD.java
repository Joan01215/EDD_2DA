package eva02_8_recursividad;

public class EVA02_8_RECURSIVIDAD {

    public static void main(String[] args) {
        imprimirCiclo(5);
    }
    public static void imprimirCiclo(int numero){
        for (int i  = numero;i  >= 1;i --){
        System.out.println( i + " - ");
            
        }
        System.out.println("");
    }
    public static void imprirmirRecu(int numero){
        //RESUELVA UNA PARTE DEL PROBLEMA
        System.out.println(numero + " - ");
        //SE LLAME A SI MISMO
        if(numero > 1)//DETENER LA RECURSIVIDIDAD
            imprirmirRecu(numero -1);
    }
}
