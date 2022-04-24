package recursos.leer_y_meter_array;

import java.util.Scanner;

public class LeerYMeterEnArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int nums = sc.nextInt();
        int[] arrNums = new int[nums];
        for (int i = 0; i < nums; i++){
            arrNums[i] = sc.nextInt();
        }

        
        String linea = sc.nextLine();
        String[] arr = linea.split(" ");
        int[] arrNums1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arrNums1[i] = Integer.parseInt(arr[i]);
        }


    }
}
