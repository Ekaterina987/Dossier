package recursos.formato_fecha;

public class Calculo_Dias_Horas {
    public static void main(String[] args) {
        calcularDias(615);
    }
    private static void calcularDias(long horasTotales){
        int dias = (int) (horasTotales / 24);
        int horas = (int) (horasTotales % 24);
        System.out.printf("%d %02d%n", dias, horas);
    }
}
