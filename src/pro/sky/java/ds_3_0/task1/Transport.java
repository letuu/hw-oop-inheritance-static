package pro.sky.java.ds_3_0.task1;

public abstract class Transport {

    private static final String DEFAULT_STRING_VALUE = "\"Информация не указана\"";
    private final String brand;
    private final String model;
    private final int manufactureYear;
    private final String manufactureCountry;
    private String color;
    private int maxSpeed;
    protected final String fuelType;

    public Transport(String brand,
                     String model,
                     int manufactureYear,
                     String manufactureCountry,
                     String color,
                     int maxSpeed,
                     String fuelType) {
        this.brand = ValidationUtils.validOrDefault(brand, DEFAULT_STRING_VALUE);
        this.model = ValidationUtils.validOrDefault(model, DEFAULT_STRING_VALUE);
        this.manufactureYear = Math.max(manufactureYear, 0);
        this.manufactureCountry = manufactureCountry;
        this.fuelType = checkFuelTypeOrDefault(fuelType);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getManufactureCountry() {
        return manufactureCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, DEFAULT_STRING_VALUE);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed >= 0 ? maxSpeed : 0;
        this.maxSpeed = Math.max(maxSpeed, 1);
    }

    public abstract void Refill();

    protected abstract String checkFuelTypeOrDefault(String fuelType);

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", manufactureCountry='" + manufactureCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelType=" + fuelType +
                '}';
    }
}
