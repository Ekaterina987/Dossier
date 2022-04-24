package recursos.formato_fecha;

public class FormatoFecha {

    public static void main(String[] args){
        formateo();
    }

    private static void formateo(){

        int dias = 10;
        int horas = 3;
        int min = 30;
        int seg = 0;
        System.out.printf("%d %02d:%02d:%02d%n", dias, horas, min, seg);

    }
}
