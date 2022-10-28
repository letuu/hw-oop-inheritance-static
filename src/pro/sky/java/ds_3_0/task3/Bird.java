package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

public abstract class Bird extends Animal {

    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public void hunt() {
        System.out.println("Птицы охотятся на насекомых и грызунов");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, DEFAULT_STRING_VALUE);
    }

    @Override
    public void eat() {
        System.out.println("Птицы питаются семенами, насекомыми и грызунами");
    }

    @Override
    public void go() {
        System.out.println("Птицы умеют летать, плавать и ходить");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "animal=" + super.toString() +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
