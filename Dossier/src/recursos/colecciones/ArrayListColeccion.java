package recursos.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListColeccion {
    public static void main(String[] args){
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 15));
        personas.add(new Persona("Juan", 13));
        personas.add(new Persona("Alicia", 15));
        Collections.sort(personas);
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona actual = it.next();
            System.out.println("Nombre: " + actual.getNombre() + ", Edad: " + actual.getEdad());
        }
        Persona lorena = new Persona("Lorena", 29);
        personas.add(lorena);
        System.out.println(personas.contains(lorena) ? "Está Lorena" : "No está lorena");

    }

}

class Persona implements Comparable<Persona>{
    private int edad;
    private String nombre;

    public Persona( String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona() {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Persona o) {
        int res = this.getNombre().compareToIgnoreCase(o.getNombre());
        if(res==0){
            return this.getEdad()<o.getEdad()?-1:1;
        }else{
            return res;
        }
    }
}
