package task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        //записываем в массив 10 строк (считываются с клавиатуры)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<10;i++){
            list.add(reader.readLine());
        }

        int min = list.get(0).length();

        //в цикле прогоняем каждый элемент массива, сравнивая его с min (начальное значение равно длинне первого элемента массива)
        for (int i = 1;i<10;i++){
            if (list.get(i).length()<min){
                min=list.get(i).length();
            }
        }

        int max = list.get(0).length();

        //в цикле прогоняем каждый элемент массива, сравнивая его с max (начальное значение равно длинне первого элемента массива)
        for (int i = 1;i<10;i++){
            if (list.get(i).length()>max){
                max=list.get(i).length();
            }
        }

        //находим позицию самой длинной строки (если их несколько, все последующие игнорируются)
        int maxposition=0;
        for(int i =0;i<10;i++){
            if (list.get(i).length()==max){
                maxposition=i;
                break;
            }
        }

        //находим позицию самой короткой строки (если их несколько, все последующие игнорируются)
        int minposition=0;
        for(int i =0;i<10;i++){
            if (list.get(i).length()==min){
                minposition=i;
                break;
            }
        }

        //сравниваются позиции самой короткой и самой длинной строк, выводится содержимое строки, которая встретилась раньше.
        if(maxposition<minposition){
            System.out.println(list.get(maxposition));
        }else{
            System.out.println(list.get(minposition));
        }


    }
}
