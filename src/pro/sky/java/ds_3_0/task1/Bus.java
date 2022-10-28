package pro.sky.java.ds_3_0.task1;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int manufactureYear,
               String manufactureCountry,
               String color,
               int maxSpeed,
               String fuelType) {
        super(brand, model, manufactureYear, manufactureCountry, color, maxSpeed, fuelType);
    }

    @Override
    public void Refill() {
        System.out.println("Тип топлива для автобуса " + getBrand() + " " + getModel()  + ": " + this.fuelType);
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        if (!"бензин дизель".contains(fuelType)) {
            return "дизель";
        } else {
            return fuelType;
        }
    }
}
