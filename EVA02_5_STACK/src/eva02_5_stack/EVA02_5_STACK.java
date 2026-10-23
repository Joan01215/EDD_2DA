package eva02_5_stack;

public class EVA02_5_STACK {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Agregar elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Mostrar la pila
        System.out.println("Pila:");
        stack.imprimir();

        // Obtener el valor del último elemento sin eliminarlo
        System.out.println("Último elemento: " + stack.peek());

        // Eliminar el último elemento y mostrar su valor
        System.out.println("Elemento eliminado: " + stack.pop());

        // Mostrar la pila después de eliminar un elemento
        System.out.println("Pila después de eliminar un elemento:");
        stack.imprimir();
    }
}
  
