package task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }


        ArrayList<String> result = doubleValues(list);

        for (String s : result){
            System.out.println(s);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listTwo = new ArrayList<String>();

        for (int i=0;i<list.size();i++){
            listTwo.add(list.get(i));
            listTwo.add(list.get(i));
        }
        return listTwo;
    }
}