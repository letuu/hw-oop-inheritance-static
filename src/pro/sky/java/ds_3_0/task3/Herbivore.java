package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

import java.util.Objects;

public class Herbivore extends Mammal {

    private String foodType;

    public Herbivore(String name,
                     int age,
                     String livingEnvironment,
                     int movementSpeed,
                     String foodType) {
        super(name, age, livingEnvironment, movementSpeed);
        setFoodType(foodType);
    }

    public void graze() {
        System.out.println("Травоядные пасутся днем по 8 часов в сутки");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validOrDefault(foodType, DEFAULT_STRING_VALUE);
    }

    @Override
    public void sleep() {
        System.out.println("Травоядные млекопитающие спят 9 часов в сутки");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(foodType, herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "mammal=" + super.toString() +
                ", foodType='" + foodType + '\'' +
                '}' +
                "\n" + getName() + " принадлежит к классу " + getClass().getSimpleName() + " - 'Травоядные'";
    }
}
