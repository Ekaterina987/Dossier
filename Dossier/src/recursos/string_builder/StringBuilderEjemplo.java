package recursos.string_builder;

public class StringBuilderEjemplo {
    public static void main(String args[]){
        String abcba = "abcba";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(abcba);
        strBuilder.reverse();
        System.out.println(strBuilder);

        System.out.println(abcba.equals(strBuilder.toString()) ? "coinciden":"no coinciden");

    }
}
