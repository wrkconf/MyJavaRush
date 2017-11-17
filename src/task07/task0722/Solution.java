package task07.task0722;

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
        String x = "start";

        for ( ;!(x.equals("end"));){
            x = reader.readLine();
            if(x.equals("end")){
                break;
            }
            list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        do {
            x = reader.readLine();
            if(x.equals("end")){
                break;
            }
            list.add(x);
        } while (!(x.equals("end")));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        } */


    }
}
