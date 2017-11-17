package task07.task0720;

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

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(reader.readLine()), m = parseInt(reader.readLine());

        System.out.println("Введите " + n + " строк:");
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i<m; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
