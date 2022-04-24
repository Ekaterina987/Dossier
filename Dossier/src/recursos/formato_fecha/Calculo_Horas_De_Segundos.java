package recursos.formato_fecha;

public class Calculo_Horas_De_Segundos {

    long segundosTotales = 18600;
    int dias = (int)(segundosTotales / 86400);
    int horas = (int)(segundosTotales / 3600)%24;
    int minutos = (int)(segundosTotales / 60)%60 ;
    int segundos = (int)(segundosTotales % 60);

}
