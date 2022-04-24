package recursos.string_builder;

public class StringBuilderEjemplo {
    public static void main(String args[]){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Hola");
        strBuilder.reverse();
        System.out.println(strBuilder);
        String aloh = "aloH";
        System.out.println(aloh.equals(strBuilder.toString()) ? "coinciden":"no coinciden");

    }
}
