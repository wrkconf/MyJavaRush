package task08.task0816;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Arni", new Date("JANUARY 1 1980"));
        map.put("Adam", new Date("FEBRUARY 1 1980"));
        map.put("Tom", new Date("MARCH 1 1980"));
        map.put("Ilon", new Date("APRIL 1 1980"));
        map.put("Steave", new Date("MAY 1 1980"));
        map.put("Bill", new Date("JUNE 1 1980"));
        map.put("John", new Date("JULY 1 1980"));
        map.put("Alex", new Date("AUGUST 1 1980"));
        map.put("Adriana", new Date("SEPTEMBER 1 1980"));

        return (HashMap<String, Date>) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        for (Map.Entry<String, Date> entry : map.entrySet()){
            //System.out.println("ID: " + entry.getKey() + " Дата: " + entry.getValue());
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
            //System.out.println("месяц: " + dateFormat.format(entry.getValue()));
            if ((entry.getValue().getMonth()>4)&&(entry.getValue().getMonth()<8)){
                map.remove(entry.getKey());
            }
        }

        for (Map.Entry<String, Date> pair : map.entrySet()){
            System.out.println("ключ: " + pair.getKey() + " Значение: " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
