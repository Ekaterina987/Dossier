package recursos.factorial;

public class Factorial {
    public static void main(String[] args) {
        int num = 8;
        int factorial = 1;
        int ultimo;
        for(int i = 1; i <=num; i++){
            ultimo = i;
            factorial *=ultimo;
        }
        System.out.println(factorial);
    }
}
