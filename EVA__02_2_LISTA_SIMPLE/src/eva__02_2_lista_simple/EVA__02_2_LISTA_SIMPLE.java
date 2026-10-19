
package eva__02_2_lista_simple;

public class EVA__02_2_LISTA_SIMPLE {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        /*int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime();
        
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random() * 100));
            
            
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);*/
        System.out.println("Tamaño de la lista = " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimir();
        System.out.println("Tamaño de la lista = " + lista.longitud());
        System.out.println("Impresion Inversa: ");
        lista.imprimirInverso();
        System.out.println("Valor en la posicion 5: " + lista.valorEn(5));
        
        lista.vaciarLista();
        lista.imprimir();
        System.out.println("Tamañño de lista: " + lista.longitud());
    }
    
}
