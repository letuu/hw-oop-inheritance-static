package pro.sky.java.ds_3_0.task3;

import pro.sky.java.ds_3_0.task1.ValidationUtils;

public class FlightlessBird extends Bird {

    private final String movementType;

    public FlightlessBird(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = ValidationUtils.validOrDefault(movementType, "\"Информация не указана\"");
    }

    public void walk() {
        System.out.println("Нелетающие птицы гуляют днем");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void go() {
        System.out.println("Нелетающие птицы умеют плавать и ходить");
    }

    @Override
    public String toString() {
        return "FlightlessBird{" +
                "bird=" + super.toString() +
                ", movementType='" + movementType + '\'' +
                '}' +
                "\n" + getName() + " принадлежит к классу " + getClass().getSimpleName() + " - 'Нелетающие'";
    }
}
