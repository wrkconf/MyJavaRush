package task07.task0713;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<20;i++){
            list.add(parseInt(reader.readLine()));
        }

        for (int i = 0;i<20;i++){
            if(list.get(i)%3==0){
                first.add(list.get(i));
            }
            if(list.get(i)%2==0){
                second.add(list.get(i));
            }
            if((list.get(i)%3!=0)&&(list.get(i)%2!=0)){
                other.add(list.get(i));
            }
        }

        printList(first);
        printList(second);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
