package recursos.formato_fecha;

public class Calculo_Horas_De_Minutos {
    public static void main(String[] args) {
        calcularHora(18625);
    }
    private static void calcularHora(long minutosTotales){
        int dias = (int) (minutosTotales / 1440);
        int horas = (int) (minutosTotales / 60) % 24;
        int minutos = (int) (minutosTotales % 60);
        System.out.printf("%d %02d:%02d%n", dias, horas, minutos);
    }
}
