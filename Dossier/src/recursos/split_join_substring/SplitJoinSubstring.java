package recursos.split_join_substring;

public class SplitJoinSubstring {
    public static void main(String args[]){
        String cadena = "Hola esto es una cadena";
        String[] palabras = cadena.split(" ");
        String cadenaUnida = String.join(", ", palabras);
        String hola = cadena.substring(0, 4);
        System.out.println(cadena);
        System.out.println(cadenaUnida);
        System.out.println(hola);

    }
}
