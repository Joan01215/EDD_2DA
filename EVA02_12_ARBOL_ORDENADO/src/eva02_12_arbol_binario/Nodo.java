package eva02_12_arbol_binario;

public class Nodo {
        //DOS ATRIBUTOS
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    //CONTRUCCIONES:

    public Nodo() {
        izquierda = null;
        derecha = null;
    }

    public Nodo(int valor) { //PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NODO
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }
}

