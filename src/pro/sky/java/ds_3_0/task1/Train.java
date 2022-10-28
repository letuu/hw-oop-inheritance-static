package pro.sky.java.ds_3_0.task1;

public class Train extends Transport {

    private float tripPrice;
    private int travelTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWagon;

    public Train(String brand,
                 String model,
                 int manufactureYear,
                 String manufactureCountry,
                 String color,
                 int maxSpeed,
                 String fuelType,
                 float tripPrice,
                 int travelTime,
                 String departureStation,
                 String endingStation,
                 int numberOfWagon) {
        super(brand, model, manufactureYear, manufactureCountry, color, maxSpeed, fuelType);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setEndingStation(endingStation);
        setNumberOfWagon(numberOfWagon);
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        this.tripPrice = Math.max(tripPrice, 1.0f);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation, "default");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = ValidationUtils.validOrDefault(endingStation, "default");
    }

    public int getNumberOfWagon() {
        return numberOfWagon;
    }

    public void setNumberOfWagon(int numberOfWagon) {
        this.numberOfWagon = Math.max(numberOfWagon, 1);
    }

    @Override
    public void Refill() {
        System.out.println("Тип топлива для поезда " + getBrand() + " " + getModel()  + ": " + this.fuelType);
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        if (!"дизель".contains(fuelType)) {
            return "дизель";
        } else {
            return fuelType;
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "transport=" + super.toString() + ",\n" +
                "tripPrice=" + tripPrice +
                ", travelTime=" + travelTime +
                ", departureStation='" + departureStation + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", numberOfWagon=" + numberOfWagon +
                '}';
    }
}
