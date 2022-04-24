package recursos.colecciones;
import java.util.LinkedList;
public class LinkedListColeccion {
    public static void main(String[] args){

        Pila pila = new Pila();

        pila.push("Pila");
        pila.push("Una");
        pila.push("Es");
        pila.push("Esto");
        pila.push("Hola");

        System.out.println("Primer elemento: " + pila.primero());
        System.out.println("Ultimo elemento: " + pila.ultimo());
        System.out.println("Se elimina el elemento: " +pila.shift());
        System.out.println("Primer elemento: " + pila.primero());
        System.out.println("Se elimina el elemento: " +pila.pop());
        System.out.println("Ultimo elemento: " + pila.ultimo());

    }
}
class Pila {
    private LinkedList lista = new LinkedList();
    public void push(Object objeto) {
        lista.addFirst(objeto);
    }
    public Object primero() {
        return lista.getFirst();
    }
    public Object ultimo() {
        return lista.getLast();
    }
    public Object shift() {
        return lista.removeFirst();
    }
    public Object pop(){
        return lista.removeLast();
    }
}
