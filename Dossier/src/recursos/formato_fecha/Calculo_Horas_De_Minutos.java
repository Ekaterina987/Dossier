package recursos.formato_fecha;

public class Calculo_Horas_De_Minutos {
    long minutosTotales = 18600;
    int dias = (int)(minutosTotales / 1440);
    int horas = (int)(minutosTotales / 60)%24;
    int minutos = (int)(minutosTotales % 60) ;
}
