package recursos.esprimo;

public class EsPrimo {
    public static void main(String[] args) {
        int num = 7;
        boolean primo = true;
        boolean salir = false;
        if(num==1){
            primo = false;
        }
        for(int i = 2; i <= (num/2)&&!salir; i++){
            if(num%i==0){
                primo=true;
            }
        }
        System.out.println(primo?"Es primo":"No es primo");
    }
}
