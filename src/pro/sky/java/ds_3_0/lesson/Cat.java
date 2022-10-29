package pro.sky.java.ds_3_0.lesson;

import java.util.Arrays;

public class Cat extends Pet {

//    public static final int PAWS_COUNT = 4; //константа
    private static int count;

    public static int getCount() {
        return count;
    }

    public static class Breed {

        private String name;
        private String country;
        private String hairType;

        public Breed(String name, String country, String hairType) {
            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.getName();
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }

    private Pet[] friends;
    private Breed breed;
    private FavToy toy;

    public Cat(String name) {
//        this(name, LocalDate.now().getYear()); //это если будет в следующем конструкторе не возраст, а год рождения
        this(name, 0);
    }

    public Cat(String name, int age) {

        super(name, age);

        friends = new Pet[0];
        count++;
    }

    @Override
    public void eat() {
        System.out.println("Насыпают кошачий корм в миску");
        System.out.println("Ем корм");
        System.out.println("Пью воду");
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getAge()  + " лет");
    }

    public Pet[] getFriends() {
        if (friends == null) {
            friends = new Pet[0];
        }
        return friends;
    }

    public void addFriends(Pet friend) {
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[getFriends().length - 1] = friend;
    }


    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }

//    @Override
//    public void setName(String name) { //если не установить модификатор final у этого метода в Pet, то его здесь можно переопределить
//        super.setName(name);
//    }
}
