package pro.sky.java.ds_3_0.task3;

public class Main {
    public static void main(String[] args) {

        //Задание 3

        Herbivore gazelle = new Herbivore(
                "Маша",
                5,
                "горная местность",
                100,
                "сено"
        );

        Herbivore giraffe = new Herbivore(
                "Длинный",
                3,
                "саванна",
                30,
                "ветки"
        );

        Herbivore horse = new Herbivore(
                "Стрела",
                4,
                "степь",
                70,
                "овес"
        );

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        gazelle.eat();
        gazelle.go();
        gazelle.sleep();
        gazelle.walk();
        gazelle.graze();
        System.out.println();

        Predator hyena = new Predator(
                "Выдра",
                2,
                "пустыня",
                80,
                "мясо"
        );

        Predator tiger = new Predator(
                "Добряк",
                3,
                "саванна",
                110,
                "мясо"
        );

        Predator bear = new Predator(
                "Миша",
                4,
                "лес",
                60,
                "мясо, рыба"
        );

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        bear.eat();
        bear.go();
        bear.sleep();
        bear.walk();
        bear.hunt();
        System.out.println();


        Amphibian frog = new Amphibian("Квакушка", 2, "озеро");
        Amphibian snake = new Amphibian("Ужик", 1, "болото");

        System.out.println(frog);
        System.out.println(snake);

        frog.eat();
        frog.go();
        frog.sleep();
        frog.hunt();
        System.out.println();

        FlightlessBird peacock = new FlightlessBird("Павлин", 7, "джунгли", "ходит");
        FlightlessBird penguin = new FlightlessBird("Пиня", 8, "антарктида", "ходит, плавает");
        FlightlessBird birdDoDo = new FlightlessBird("Додо", 2, "лес", "прыгает");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(birdDoDo);

        birdDoDo.eat();
        birdDoDo.go();
        birdDoDo.sleep();
        birdDoDo.hunt();
        birdDoDo.walk();
        System.out.println();

        FlyingBird seagull = new FlyingBird("Чайка", 8, "остров", "полет");
        FlyingBird albatross = new FlyingBird("Альб", 4, "побережье", "полет");
        FlyingBird falcon = new FlyingBird("Сокол", 3, "степь", "полет");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

        falcon.eat();
        falcon.go();
        falcon.sleep();
        falcon.hunt();
        falcon.fly();
        System.out.println();

        System.out.println(giraffe.equals(gazelle) || giraffe.equals(horse));
    }
}
