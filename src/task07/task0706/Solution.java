package task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws Exception{
        int[] h = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0;i<h.length;i++){
            h[i]=parseInt(reader.readLine());
        }

        int even=h[0]; // четные
        int odd = 0; // нечетные

        for(int i=1;i<15;i++){
            if (i%2==0){
                even+=h[i];
            }else{
                odd+=h[i];
            }
        }
        if(even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }

}
