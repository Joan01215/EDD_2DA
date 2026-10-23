package eva02_6_tipos_genericos;

public class EVA02_6_TIPOS_GENERICOS {

    public static void main(String[] args) {
        Ejemplo<Integer> prueba = new Ejemplo<Integer>();
    }
}

class Ejemplo <T> {
    private T dato;

    public Ejemplo() {
    }
    
    public Ejemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}
