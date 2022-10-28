package pro.sky.java.ds_3_0.lesson;

public class Parrot extends Pet {

    private boolean talking;
    private String breed;

    public Parrot(String name) {
        this(name, 0);
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println("Hello!");
        super.talk();
    }

    @Override
    public void eat() {
        System.out.println("Ем корм из кормушки");
    }


    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
