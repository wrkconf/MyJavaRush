package task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("лора");
        list.add("лара");
        list.add("розы");
        list.add("жаба");
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list.add("лола");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //в циклве прогоняем каждый элемент массива. Если строке есть "р", и нет "л" - строка удаляется
        for(int i=0;i<list.size();i++){
            String x=list.get(i);
            if(!(x.contains("р")&&x.contains("л"))){
                if(x.contains("р")){
                    list.remove(i);
                }
            }
        }

        int listsize = list.size(); // выносим размер массива в переменную, чтобы цикл не стал бесконечным

        //если в строке есть л, и нет р - добавляем строку в конец списка
        for(int i=0;i<listsize;i++){
            String x=list.get(i);
            if(!(x.contains("р")&&x.contains("л"))){
                if(x.contains("л")){
                    list.add(list.get(i));
                }
            }
        }

        return list;
    }
}