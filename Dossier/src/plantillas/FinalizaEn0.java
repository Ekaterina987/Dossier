package plantillas;

import java.util.Scanner;

public class FinalizaEn0 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        caso2();
    }
    private static void caso2(){
        boolean fin = false;
        while(!fin&&sc.hasNext()){
            int num = sc.nextInt();
            if(num==0){
                fin = true;
            }else{

            }
        }

    }
}
