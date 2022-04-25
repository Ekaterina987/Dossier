package plantillas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NoSeSabe {
    public static void main(String[] args){
        caso3();
    }

    private static void caso3(){
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(System.in))){
            while (lector.ready()) {
                String linea = lector.readLine();
            }
        } catch (IOException e) {
        }
    }
}
