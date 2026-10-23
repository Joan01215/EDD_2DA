
package eva02_2_stack;

public class EVA02_2_STACK {

    public static void main(String[] args) {
            A();
            System.out.println("Termina main");
    }
    public static void A() {
        System.out.println("Inicia A()");
        B();
        System.out.println("Termina A()");
    }
    public static void B() {
        System.out.println("Inicia B()");
        int i = 5;
        double d = 5.5;
        System.out.println("Termina B()");
    }
    
}
