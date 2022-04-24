package recursos.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMap {
    public static void main(String[] args) {
        SortedMap<String, String[]> mapa = new TreeMap<>();
        mapa.put("azalea", new String[]{"Juan", "Palomo"});
        mapa.put("arbol", new String[]{"María", "Palomo"});
        mapa.put("abaco", new String[]{"Francisca", "Palomo"});



        for(Map.Entry<String, String[]> persona : mapa.entrySet()){
            System.out.println(persona.getKey() + " " + persona.getValue()[0] + " " + persona.getValue()[1]);
        }
    }
}
