package recursos.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetColeccion {
    public static void main(String[] args) {
        Set<String> miSet = new HashSet<>();

        miSet.add("Hola");
        miSet.add("Mundo");
        miSet.add("Hola");

        Iterator<String> it = miSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
