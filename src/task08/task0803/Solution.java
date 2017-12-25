package task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        Cat[] arrayCat = new Cat[10]; // создаем массив типа Cat
        for(int i = 0; i<10; i++){
            arrayCat[i]= new Cat(cats[i]);
        } // создали массив с объектами Cat, заполнили поле name
        Map<String, Cat> mapSecond = new HashMap<String, Cat>();
        for (int i=0; i<10;i++){
            mapSecond.put(arrayCat[i].name, arrayCat[i]);
        } // создали хэшМэп, заполнили
        return (HashMap<String, Cat>) mapSecond;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
