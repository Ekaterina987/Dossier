package recursos.esprimo;

public class EsPrimo {
    public static void main(String[] args) {
        System.out.println(esPrimo(2));
    }
    public static boolean esPrimo (long numero) {
        boolean primo=true;
        numero = Math.abs(numero);
        if (numero==0 || numero==1) {
            return false;
        }
        else if (numero>2) {
            long divisor=2;
            while (primo && divisor<=Math.sqrt(numero)) {
                if (numero%divisor==0) {
                    primo = false;
                }
                divisor++;
            }
        }
        return primo;
    }

}

