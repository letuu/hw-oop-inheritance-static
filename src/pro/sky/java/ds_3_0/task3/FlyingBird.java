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
    public void sleep() {
        System.out.println("Летающие птицы спят 10 часов в сутки");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
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
