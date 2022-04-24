package recursos.formato_fecha;

public class Calculo_Horas_De_Segundos {
    public static void main(String[] args) {

        long segundosTotales = 18640;
        int dias = (int) (segundosTotales / 86400);
        int horas = (int) (segundosTotales / 3600) % 24;
        int minutos = (int) (segundosTotales / 60) % 60;
        int segundos = (int) (segundosTotales % 60);
        System.out.printf("%d %02d:%02d:%02d%n", dias, horas, minutos, segundos);
    }

}
