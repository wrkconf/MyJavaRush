package task08.task0814;

import java.io.IOException;
import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() throws IOException {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<20;set.add(i++));
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        for (Integer i:set){
            if(i>10){
                set.remove(i);
            }
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
