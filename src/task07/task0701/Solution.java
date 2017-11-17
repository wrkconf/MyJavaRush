package task07.task0701;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int m=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>m){
                m=array[i];
            }
        }
        return m;

    }
}