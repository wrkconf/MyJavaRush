package task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<a.length;i++){
            a[i]=parseInt(reader.readLine());
        }

        for(int i = 0;i<10;i++){
            first[i]=a[i];
        }
        for(int i = 0;i<10;i++){
            second[i]=a[i+10];
        }

        for (int i = 0;i<second.length;i++){
            System.out.println(second[i]);
        }


    }

}
