package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

public class Predator extends Mammal {

    private String foodType;

    public Predator(String name,
                    int age,
                    String livingEnvironment,
                    int movementSpeed,
                    String foodType) {
        super(name, age, livingEnvironment, movementSpeed);
        setFoodType(foodType);
    }

    public void hunt() {
        System.out.println("Хищники охотятся на зверей и рыб");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = ValidationUtils.validOrDefault(foodType, DEFAULT_STRING_VALUE);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "mammal=" + super.toString() +
                ", foodType='" + foodType + '\'' +
                '}' +
                "\n" + getName() + " принадлежит к классу " + getClass().getSimpleName() + " - 'Хищники'";
    }
}
