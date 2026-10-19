
package eva__02_2_lista_simple;

public class ListaSimple {
    private Nodo inicio;
    private Nodo fin;
    public ListaSimple(){
        inicio = null;
        fin = null;
    }
    public void agregar (int valor){
        Nodo nuevo = new Nodo(valor);
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{//LISTA CON NODOS
              //MOVERNOS AL FINAL
        /*Nodo temp = inicio;
        while(temp.getSiguiente()!= null){
                temp = temp.getSiguiente();
        }
        temp.setSiguiente(nuevo);*/
        fin.setSiguiente(nuevo);
        fin = nuevo;
            
        }
    }
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.println("!" + temp.getValor() + "!");
            temp = temp.getSiguiente();
            
            //AGREGAR UN METODO DE IMPRIMIR EN ORDEN INVERSO
        }
    }
    //QUE MODIFICAR PARA QUE SEA 0(1)?
    public int longitud(){
        int cont = 0;
        Nodo Temp = inicio;
        while(Temp != null){;
            cont = cont +1;
        
            Temp = Temp.getSiguiente();
    }
    return cont;
    }
    public boolean listaVacia(){
        if(inicio == null){//LISTA VACIA? VERDADERO
            return true;
    }else{//LISTA CON NODOS
    return false;
    }
}
    public void vaciarLista(){
        inicio = null;
        fin = null;
    }
    public int valorEn(int posicion)throws RuntimeException{
    //EXCEPCION
    //VALIDAR POSICION
    int tama = longitud();
    if(posicion >= 0 && posicion < tama){
    //que posiciones son validas? DE 0(CERO) A N - 1 (N ES LA CANTIDAD DE NODOS)
    Nodo temp = inicio;
    for (int i = 0; i < posicion; i++) {
        temp = temp.getSiguiente();
    }
    return temp.getValor();
        }else{//posicion no valida
    throw new RuntimeException("La posicion " + posicion +  " no es valida");
}
}
    public void insertarEn (int valor, int posicion){
        if(posicion < 0 || posicion > longitud()){
            throw new IndexOutOfBoundsException("Posicion no valida");
        }else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0){//INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null){//LISTA VACIA
                    fin = nuevo;
                }
            }else if(posicion == longitud()){//INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }else{//INSERTAR EN EL MEDIO
               Nodo temp = inicio;
               for(int i = 0; i < posicion - 1; i++){
                    temp = temp.getSiguiente();
                    }
            
                
            
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        
        }
    }
}
    public void borrarEn(int posicion){
        if(posicion < 0 || posicion >= longitud()){
            throw new IndexOutOfBoundsException("Posicion no valida");
        }else{
            if(posicion == 0){//BORRAR AL INICIO
                inicio = inicio.getSiguiente();
                if(inicio == null){
                    fin = null;
                }
            }else{//BORRAR EN EL MEDIO O EL FINAL
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++){
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(temp.getSiguiente() == null){//BORRA AL FINAL
                    fin = temp;
                }
            
        }
    }
}
    public void imprimirInverso(){
    imprimirInverso(inicio);
}

private void imprimirInverso(Nodo actual){
    if(actual == null){
        return;                          
    }
    imprimirInverso(actual.getSiguiente()); 
    System.out.println("!" + actual.getValor() + "!");  
}
}
