package task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather = new Human("Дед1",true, 70);
        Human grandfather2 = new Human("Дед2",true, 72);
        Human grandmother = new Human("Бабушка1",false, 69);
        Human grandmother2 = new Human("Бабушка2",false, 666);
        Human father = new Human("Батя",true, 44, grandfather, grandmother );
        Human mother = new Human("Мама",false, 38, grandfather2, grandmother2 );
        Human daughter = new Human("Дочь",false, 14, father, mother );
        Human son = new Human("Сын1",true, 19, father, mother );
        Human son2 = new Human("Сын2",true, 10, father, mother );

        System.out.println(grandfather.toString());
        System.out.println(grandfather.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(daughter.toString());
        System.out.println(son.toString());
        System.out.println(son2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















