package pro.sky.java.ds_3_0.task1;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    private float  engineVolume;
    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int placesCount;
    private boolean winterTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int maxSpeed,
               int manufactureYear,
               String manufactureCountry,
               String fuelType,
               String gearBox,
               String bodyType,
               String regNumber,
               int placesCount,
               boolean winterTires,
               Key key,
               Insurance insurance) {
        super(brand, model, manufactureYear, manufactureCountry, color, maxSpeed, fuelType);
        this.bodyType = ValidationUtils.validOrDefault(bodyType, "default");
        this.placesCount = Math.max(placesCount, 1);
        this.key = key == null ? new Key() : key;
//        if (key == null) {
//            this.key = new Key();
//        } else {
//            this.key = key;
//        }
//        this.key = Objects.requireNonNullElseGet(key, Key::new); //или так
        this.insurance = insurance == null ? new Insurance() : insurance;
        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }

    public void setSeasonTires() {
//        int currentMonth = LocalDate.now().getMonth().getValue();
        int currentMonth = LocalDate.now().getMonthValue();
//        this.winterTires = currentMonth <= 4 || currentMonth >= 11; //можно так записать проверку и присваивание - это булево выражение
        if (currentMonth <= 4 || currentMonth >= 11) {
            this.winterTires = true;
        } else {
            this.winterTires = false;
        }
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
//        return symbol >= '0' && symbol <= '9';
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }


    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDefault(gearBox, "default");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "default");
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public void Refill() {
        System.out.println("Тип топлива для автомобиля " + getBrand() + " " + getModel()  + ": " + this.fuelType);
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        if (!"бензин дизель электричество".contains(fuelType)) {
            return "бензин";
        } else {
            return fuelType;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "transport=" + super.toString() + ", \n" +
                "engineVolume=" + engineVolume +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", placesCount=" + placesCount +
                ", tires=" + (winterTires ? "зимняя" : "летняя") +
                ", запуск двигателя=" + (this.getKey().isRemoteEngineStart() ? "удаленный" : "обычный") +
                ", доступ=" + (this.key.keylessEntry ? "безключевой" : "с помощью ключа") +
                ", номер страховки=" + insurance.number +
                ", стоимость страховки=" + insurance.cost +
                ", срок действия страховки=" + insurance.validUntil +
                '}';
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public static class Insurance {

        private final LocalDate validUntil;
        private final float cost;
        private final String number;


        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(365);
            this.cost = Math.max(cost, 1f);
            this.number = ValidationUtils.validOrDefault(number, "000000000");
        }

        public Insurance() {
            this(null, 5_000, null);
        }

        public LocalDate getValidUntil() {
            return validUntil;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

//        public boolean isNumberValid() {
//            return number.length() == 9;
//        }

        public void isNumberValid() {
            if (number.length() == 9) {
                System.out.println("Номер страховки корректный");
            } else {
                System.out.println("Номер страховки некорректный");
            }
        }

//        public boolean isInsuranceValid() {
//            return LocalDate.now().isBefore(this.validUntil);
//        }

        public void isInsuranceValid() {
            if (validUntil.isBefore(LocalDate.now()) || validUntil.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно оформить новую страховку");
            }
        }
    }
}
