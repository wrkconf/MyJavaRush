package task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listOddEven = new ArrayList<String>();
        for (int i = 0; i< list.size(); i++){
            if ((list.get(i).length())%2==0){
                //если четно, то удваиваем
                listOddEven.add(list.get(i) + list.get(i));
            }else{
                listOddEven.add(list.get(i) + list.get(i) + list.get(i));
            }
        }
        for (int i = 0; i < listOddEven.size(); i++) {
            System.out.println(listOddEven.get(i));
        }

    }
}
