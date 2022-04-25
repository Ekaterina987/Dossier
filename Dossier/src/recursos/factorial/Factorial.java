package recursos.factorial;

public class Factorial {
    public static void main(String[] args) {
        calcFactorial(8);
    }
    private static long calcFactorial(long num){
        long factorial = 1;
        long ultimo;
        for(long i = 1; i <=num; i++){
            ultimo = i;
            factorial *=ultimo;
        }
        return factorial;
    }
}
