package eva02_12_arbol_binario;

public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    public void agregar(int valor) {
        if(root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecu(root, valor);
        }
    }

    private void agregarRecu(Nodo actual, int valor) {
        if(valor < actual.getValor()) {
            if(actual.getIzquierda() == null) {
                actual.setIzquierda(new Nodo(valor));
            } else {
                agregarRecu(actual.getIzquierda(), valor);
            }
        } else if(valor > actual.getValor()) { 
            if(actual.getDerecha() == null) {
                actual.setDerecha(new Nodo(valor));
            } else {
                agregarRecu(actual.getDerecha(), valor);
            }
        }
    }

    public void preOrder() {
        preOrderRecu(root);
    }

    public void inOrder() {
        inOrderRecu(root);
    }

    public void postOrder() {
        postOrderRecu(root);
    }

    private void preOrderRecu(Nodo actual) {
        System.out.println("[" + actual.getValor() + "]");
        if(actual.getIzquierda() != null) {
            preOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null) {
            preOrderRecu(actual.getDerecha());
        }
    }

    private void inOrderRecu(Nodo actual) {
        if(actual.getIzquierda() != null) {
            inOrderRecu(actual.getIzquierda());
        }
        System.out.println("[" + actual.getValor() + "]");
        if(actual.getDerecha() != null) {
            inOrderRecu(actual.getDerecha());
        }
    }

    private void postOrderRecu(Nodo actual) {
        if(actual.getIzquierda() != null) {
            postOrderRecu(actual.getIzquierda());
        }
        if(actual.getDerecha() != null) {
            postOrderRecu(actual.getDerecha());
        }
        System.out.println("[" + actual.getValor() + "]");
    }
}