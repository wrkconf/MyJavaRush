package task07.task0704;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception{
        int[] a = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<a.length;i++){
            a[i]= Integer.parseInt(reader.readLine());
        }
        for(int i=0;i<5;i++){
            int x=a[i];
            a[i]=a[9-i];
            a[9-i]=x;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}