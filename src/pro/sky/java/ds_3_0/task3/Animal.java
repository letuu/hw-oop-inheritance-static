package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animal {

    public final String DEFAULT_STRING_VALUE = "\"Информация не указана\"";
    private String name;
    private int birthYear;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        if (this.getClass() == Herbivore.class) {
            System.out.println("Травоядные млекопитающие спят 9 часов в сутки");
        }
        if (this.getClass() == Predator.class) {
            System.out.println("Хищники спят 12 часов в сутки");
        }
        if (this.getClass() == Amphibian.class) {
            System.out.println("Земноводные спят 10 часов в сутки");
        }
        if (this.getClass() == FlightlessBird.class) {
            System.out.println("Нелетающие птицы спят 8 часов в сутки");
        }
        if (this.getClass() == FlyingBird.class) {
            System.out.println("Летающие птицы спят 10 часов в сутки");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_STRING_VALUE);
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return birthYear == animal.birthYear && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
