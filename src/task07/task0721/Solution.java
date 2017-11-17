package task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

/*
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>(20);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 20 чисел:");
        for (int i = 0; i < 20; i++) {
            list.add(parseInt(reader.readLine()));
        }

        int max = list.get(0);
        int min = list.get(0);
        for (int i = 1; i<list.size(); i++){
            if (max>list.get(i)){
                max=list.get(i);
            }
            if (min<list.get(i)){
                min=list.get(i);
            }
        }

        System.out.println(max + " " + min);

    }
}
