package recursos.factorial;

public class FactorialRecursivo {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(calcularFactorial(num));
    }
    public static int calcularFactorial(int num){
        if(num == 1){
            return num;
        }else{
            return calcularFactorial(num - 1) * num;
        }
    }
}
