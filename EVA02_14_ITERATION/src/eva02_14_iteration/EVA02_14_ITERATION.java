
package eva02_14_iteration;

import java.util.Iterator;
import java.util.LinkedList;

public class EVA02_14_ITERATION {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        /*lista.add(100);//0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4*/
        for (int i = 0; i < 10000000; i++) {
            lista.add((int)(Math.random()*1000));
            
        }
        System.out.println("Elementos en la lista: " + lista);
        System.out.println("Tamaño de la lista: " + lista.size());
        
        Iterator<Integer> iterador = lista.iterator();
        int promedio = 0;
        while(iterador.hasNext()){
            promedio+= iterador.next();
        }
        System.out.println("Sumatoria = " + promedio);
        System.out.println("Promedio = " + (promedio/(double)lista.size()));
    }
    
}
