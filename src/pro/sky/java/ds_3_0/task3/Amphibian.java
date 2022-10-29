package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

import java.util.Objects;

public class Amphibian extends Animal {

    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public void hunt() {
        System.out.println("Земноводные охотятся на насекомых и рыб");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, DEFAULT_STRING_VALUE);
    }

    @Override
    public void eat() {
        System.out.println("Земноводные питаются рыбами и насекомыми");
    }

    @Override
    public void go() {
        System.out.println("Земноводные умеют плавать, ползать и ходить");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводные спят 10 часов в сутки");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "animal=" + super.toString() +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}' +
                "\n" + getName() + " принадлежит к классу " + getClass().getSimpleName() + " - 'Земноводные'";
    }
}
