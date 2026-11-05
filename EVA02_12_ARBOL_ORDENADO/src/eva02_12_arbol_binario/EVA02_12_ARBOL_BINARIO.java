package eva02_12_arbol_binario;

public class EVA02_12_ARBOL_BINARIO {

    public static void main(String[] args) {
                ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(7);
        arbol.agregar(2);
        arbol.agregar(4);
        arbol.agregar(6);
        arbol.agregar(8);
        arbol.agregar(1);
        arbol.preOrder();
        System.out.println("");
        arbol.inOrder();
        System.out.println("");
        arbol.postOrder();
    }
    
}
