package pro.sky.java.ds_3_0.task1;

import java.time.LocalDate;

public class HwOop31 {
    public static void main(String[] args) {

        Car.Key remoteEngineStart = new Car.Key(true, false);
        Car.Key remoteEngineStart_KeylessEntry = new Car.Key(true, true);
        Car.Key keylessEntry = new Car.Key(false, true);
        Car.Key no_RemoteEngineStart_KeylessEntry = new Car.Key(false, false);

        System.out.println(LocalDate.now());
        Car.Insurance one = new Car.Insurance(LocalDate.of( 2022 , 10 , 25 ), 1000f, "12345678910");

        Car lada = new Car("Lada", "Granta", 1.7f, "желтый", 200, 2015, "Россия", "бензин", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 210, 2020, "Германия", "дизель", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car bmw = new Car("BMW", "Z8", 3.0f, "черный", 220, 2021, "Германия", "электричество", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 230, 2018, "Южная Корея", "бензин", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 240, 2016, "Южная Корея", "дизель", "механика", "седан", "а555пр777", 5, true, remoteEngineStart, one);
        Car defaultCar = new Car(null,
                null,
                0f,
                null,
                0,
                0,
                null,
                "вода!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
                "механика",
                "седан",
                "а555рр777",
                5,
                false,
                new Car.Key(),
                new Car.Insurance()
        );


        System.out.println();
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println();
        System.out.println(defaultCar);

        defaultCar.setWinterTires(true); //установили зимнюю резину
        System.out.println(defaultCar);
        defaultCar.setSeasonTires(); //установка текущего сезона шин
        System.out.println(defaultCar);
        System.out.println();

        System.out.println(defaultCar.getRegNumber());
        System.out.println(defaultCar.isRegNumberValid());
        defaultCar.setRegNumber("А555РР777");
        System.out.println(defaultCar.getRegNumber());
        System.out.println(defaultCar.isRegNumberValid());
        System.out.println();

        System.out.println("Удаленный запуск двигателя у audi: " + audi.getKey().isRemoteEngineStart());
        System.out.println("Бесключевой доступ у audi: " + audi.getKey().isKeylessEntry());

        System.out.println();
        audi.getInsurance().isNumberValid();
        audi.getInsurance().isInsuranceValid();

        System.out.println();

        Train lastochka = new Train(
                "Ласточка",
                "модель B-90",
                2011,
                "Россия",
                null,
                301,
                "дизель",
                3500f,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11
        );

        Train leningrad = new Train(
                "Ленинград",
                "модель D-125",
                2019,
                "Россия",
                null,
                270,
                "ofijreogijworeig",
                1700f,
                0,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8
        );

        System.out.println(lastochka);
        System.out.println();
        System.out.println(leningrad);
        System.out.println();

        Bus liaz = new Bus (
                "ЛИАЗ",
                "Модель 232",
                2010,
                "Россия",
                "Белый",
                170,
                "дизель"
        );

        Bus paz = new Bus (
                "ПАЗ",
                "Модель 247",
                2011,
                "Россия",
                "Желтый",
                160,
                "бензин"
        );

        Bus ikarus = new Bus (
                "Икарус",
                null,
                2005,
                "Россия-Венгрия",
                "Красный",
                180,
                "электричество"
        );

        System.out.println(liaz);
        System.out.println(paz);
        System.out.println(ikarus);
        System.out.println();

        bmw.Refill();
        leningrad.Refill();
        paz.Refill();

    }
}
