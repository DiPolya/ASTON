package org.example;
public class Main {

    public static void main(String[] args) {
        Bowl bowl = new Bowl(75); // создаём миску с едой
        Cat[] cats = {
                new Cat("Мохнатый", 23),
                new Cat("Кузя", 57),
                new Cat("Резерфорд", 80),
        };

        Cat cat1 = new Cat("Снежок", 32);
        Cat cat2 = new Cat("Блохастый", 21);
        Cat cat3 = new Cat("Царь", 67);
        Dog dog1 = new Dog ("Хатико");
        Dog dog2 = new Dog ("Бим");
        Dog dog3 = new Dog ("Шерлок");

        cat1.run(170);
        cat1.swim(2);

        cat2.run(25);
        cat2.swim(1);

        cat3.run(250);
        cat3.swim(17);

        dog1.run(499);
        dog1.swim(11);

        dog2.run(345);
        dog2.swim(7);

        dog3.run(100);
        dog3.swim(1);

        for (Cat cat : cats) {
            cat.eat(bowl); // коты едят
            System.out.println("\nСытость котов: " + cat.getName() + " Сыт: " + cat.isSat());
        }

        System.out.println("\nДобавим еды: ");
        bowl.addFood(10);

        for (Cat cat : cats){
            if (!cat.isSat()){
                cat.eat(bowl);
            }
        }

        for (Cat cat : cats){
            System.out.println("\nУровень сытости кота после добавления еды в миске: " +
                    cat.getName() + " Сыт: " + cat.isSat() );
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("\nКотов:" + Cat.getCatCount());
        System.out.println("\nСобак: " + Dog.getDogCount());
    }
}