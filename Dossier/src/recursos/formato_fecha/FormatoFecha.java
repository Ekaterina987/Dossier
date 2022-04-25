package recursos.formato_fecha;

public class FormatoFecha {

    public static void main(String[] args){
        formateo(10,3,30,0);
    }
    private static void formateo(int dias, int horas, int min, int seg){
        System.out.printf("%d %02d:%02d:%02d%n", dias, horas, min, seg);
    }
}
