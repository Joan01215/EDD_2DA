
package eva02_3_listadoble;

public class Nodo {
    
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    //CONSTRUCTORES
    public Nodo(){
        this.valor = 0;
        siguiente = null;
        previo = null;
    }
    public Nodo(int valor){
        this.valor = valor;
        siguiente = null;
        previo = null;
    }
    
    //get y set
        public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getPrevio(){
        return previo;
    }
    public void setPrevio(Nodo previo){
        this.previo = previo;
    }
}
