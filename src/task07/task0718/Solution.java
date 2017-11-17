package task07.task0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        int end=-1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i=0; i<list.size();i++){
            for (int j = i+1; j<list.size();j++){
                if(!((list.get(i).length() < list.get(j).length()))){
                    System.out.println("Первый элемент, нарушающий порядок:" + list.get(i));

                    break;
                }
                if (end>=0){
                    break;
                }
            }
        }
    }
}