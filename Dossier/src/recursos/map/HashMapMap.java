package recursos.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMap {
    public static void main(String[] args) {
        Map<Integer, String[]> mapa = new HashMap<>();
        mapa.put(1, new String[]{"Juan", "Palomo"});
        mapa.put(2, new String[]{"María", "Palomo"});
        mapa.put(3, new String[]{"Francisca", "Palomo"});

        for(Map.Entry<Integer, String[]> persona : mapa.entrySet()){
            System.out.println(persona.getKey() + " " + persona.getValue()[0] + " " + persona.getValue()[1]);
        }

    }
}
