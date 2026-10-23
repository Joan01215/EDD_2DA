package eva02_5_stack;

public class Nodo {
    //DOS ATRIBUTOS
    private int valor;
    private Nodo siguiente;
    private Nodo anterior; //AGREGAMOS EL ATRIBUTO ANTERIOR PARA PODER HACER LA LISTA DOBLE
    //CONTRUCCIONES:

    public Nodo() {
        siguiente = null; //ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
        anterior = null; //ESTO ES MUY IMPORTANTE, MARCA EL INICIO DE LA LISTA
    }

    public Nodo(int valor) { //PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}

