package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

import java.util.Objects;

public class FlyingBird extends Bird {

    private final String movementType;

    public FlyingBird(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "\"Информация не указана\"");
    }

    public void fly() {
        System.out.println("Летающие птицы умеют летать");
    }

    public String getMovementType() {
        return movementType;
    }


    @Override
    public String toString() {
        return "FlyingBird{" +
                "bird=" + super.toString() +
                ", movementType='" + movementType + '\'' +
                '}' +
                "\n" + getName() + " принадлежит к классу " + getClass().getSimpleName() + " - 'Летающие'";
    }
}
