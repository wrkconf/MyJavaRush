package task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);

        /*
        int[] array2 = new int[20];
        for (int i = 0; i < 20; i++) {

            int min = array[0];
            for (int y = 1; y < array.length; y++) {
                if (array[y] < min)
                        min = array[i];
                        array2[y]=min;
                        array[y]=999;
            } // нашли минимальное значение
        */
    }
}
