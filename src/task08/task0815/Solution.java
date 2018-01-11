package task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Егор","Летов");
        map.put("Сергей","Летов");
        map.put("Андрей","Лысиков");
        map.put("Антон","Завбялов");
        map.put("Джон","Ленон");
        map.put("Павел","Дуров");
        map.put("Николай","Дуров");
        map.put("Илон","Маск");
        map.put("Владимир","Путин");
        map.put("Алексей","Навальный");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count=0;
        for(int i=0;i<10;i++){
            for (String s : map.keySet()){
                if (s.equals(name))count++;
                }
            }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count=0;
        for(int i=0;i<10;i++){
            //containsKey
            for (String s : map.values()){
                if (s.equals(lastName))count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}