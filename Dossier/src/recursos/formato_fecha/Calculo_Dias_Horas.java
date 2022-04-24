package recursos.formato_fecha;

public class Calculo_Dias_Horas {
    public static void main(String[] args) {
        long horasTotales = 615;
        int dias = (int) (horasTotales / 24);
        int horas = (int) (horasTotales % 24);
        System.out.printf("%d %02d%n", dias, horas);
    }
}
