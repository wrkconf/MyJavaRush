package task07.task0708;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static List<String> strings;
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        //записываем в массив 5 строк (считываются с клавиатуры)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<5;i++){
            list.add(reader.readLine());
        }

        //инициализируем переменную max, присваиваем длинну первой строки массива (с индексом 0)
        int max = list.get(0).length();

        //в цикле прогоняем каждый элемент массива, начиная со второго (i), сравнивая его с предыдущим (i-1), в итоге в переменной max остается значение длинны самой длинной строки
        for (int i = 1;i<5;i++){
            if (list.get(i).length()>max){
                max=list.get(i).length();
            }
        }

        //тут длинну каждого элемента массива сравниваем с переменной max. Если равны - выводим содержимое элемента на экран.
        for(int i =0;i<5;i++){
            if (list.get(i).length()==max){
                System.out.println(list.get(i));
            }
        }

    }
}
