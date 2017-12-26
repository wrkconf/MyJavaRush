package task08.task0812;

import java.io.*;
import java.util.ArrayList;


/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList array = new ArrayList(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10;i++)
        {
            array.add(Integer.parseInt(reader.readLine()));
        }
        int maxCount=1; // максимальная длинна последовательности
        int count=1; // кол-во одинаковых чисел для текущего i
        for (int i=0;i<9;i++)
        {
                if(array.get(i).equals(array.get(i+1)))
                {
                    count++;
                }else{
                    count=1;
                }
                if (count > maxCount)maxCount=count;
        }
        System.out.println(maxCount);
    }
}