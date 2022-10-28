package pro.sky.java.ds_3_0.lesson;

public class Lesson {
    public static void main(String[] args) {

//        new Cat.Breed("British Shorthair", "GB", "short");//так предложила джава если не импортировать класс Breed
        Cat.Breed brShBreed = new Cat.Breed("British Shorthair", "GB", "short");

        Cat murzik = new Cat("Мурзик");

//        System.out.println(murzik.getBreed());
////        System.out.println(murzik.getBreed().getHairType());
//        murzik.setBreed(brShBreed);
//        System.out.println(murzik.getBreed()); // не установилось - разобраться, наверное в конструктор надо добавить
////        System.out.println(murzik.getBreed().getName()); //не печатает почему то
//
////        murzik.new FavToy("Рыбка", "заводная"); //можно так создать без имени
//        Cat.FavToy murzikFavToy = murzik.new FavToy("Рыбка", "заводная");
//        murzik.setToy(murzikFavToy);
//
//        System.out.println(murzikFavToy.getCatName());

        murzik.talk();
        murzik.eat();
        System.out.println();

        Dog sharik = new Dog("Шарик", 2005);
        sharik.setAddress("Address");
        Dog sharik2 = new Dog("Шарик", 2005);
        sharik2.setAddress("Address");

        System.out.println(sharik.equals(sharik2));
        if (sharik.equals(sharik2)) {
            sharik2 = sharik; //если равны, то можно хранить в одной ячейке памяти
        }
        System.out.println();


        sharik.talk();
        sharik.eat();
        System.out.println();

        Parrot kesha = new Parrot("Кеша");
        kesha.talk();

////        murzik.age = 3;
//        murzik.meow();
//        System.out.println(murzik.getName());
//
        Cat begemot = new Cat("Бегемот", -5);
//        begemot.age = -5;
//        begemot.name = null;
//        begemot.setName(null);
        begemot.meow();
        System.out.println();
//
//        begemot.setToy(murzikFavToy); //можно засетить коту бегемоту любимую игрушку мурзика
//        System.out.println("Игрушка кота Бегемота является любимой игрушкой кота " + murzikFavToy.getCatName());
//
////        murzik.friends = null;
//
////        System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
//
        murzik.addFriends(begemot);
        murzik.addFriends(sharik);
        murzik.addFriends(kesha);
//        murzik.addFriends(new Hack("oiuhdf"));

        // про приведение типов
        for (Pet friend : murzik.getFriends()) { //проверяем какой из наследников класса Pet используется в данном случае
//            System.out.println(friend.getName());
//            System.out.println(friend.getName().toUpperCase());
            if (friend instanceof Cat) { //какого класса тот или иной объект - френд принадлежит классу Cat?
                Cat cat = (Cat) friend; //приведение типов через заведение переменной
                cat.meow();
            } else if (friend instanceof Parrot) { //можно проверять так if (friend.getClass() == Parrot.class) из метода equals
                ((Parrot) friend).talk(); //приведение типов без переменной
            } else {
                System.out.println(friend);
            }
        }
//
//        /* murzik.friends = null;
//        System.out.println("У кота " + murzik.getName() + " " + murzik.friends.length + " друзей");
//        Будет ошибка если поле Cat[] friends неприватное, если приватное, то так написать уже будет нельзя */
//
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
//
////        murzik.friends[0].meow();
//
//        System.out.println(Cat.getCount());

//        Pet pet = new Pet("Pet");
//        pet.talk();
    }
}
