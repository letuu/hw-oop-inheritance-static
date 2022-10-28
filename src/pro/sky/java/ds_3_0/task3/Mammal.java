package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

public abstract class Mammal extends Animal {

    private String livingEnvironment; //среда проживания
    private int movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public void walk() {
        System.out.println("Млекопитающие гуляют в основном днем");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment,DEFAULT_STRING_VALUE);
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = Math.max(movementSpeed, 1);
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающие питаются животной и растительной пишей");
    }

    @Override
    public void go() {
        System.out.println("Млекопитающие умеют ходить и плавать");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "animal=" + super.toString() +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}
