package Ex_Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex_Homework_Main {

    public static void main(String[] args) {

        Country Polska = new Country("Polska",'P');
        Country Niemcy = new Country("Niemcy",'D');
        Country Austria = new Country("Austria",'A');
        Country Francja = new Country("Francja",'F');
        Country Szwecja = new Country("Szwecja",'S');
        Country Chorwacja = new Country("Chorwacja",'C');
        Country Grecja = new Country("Grecja",'G');
        Country Litwa = new Country("Litwa",'L');
        Country Estonia = new Country("Estonia",'E');
        Country Norwegia = new Country("Norwegia",'N');
        Country Japonia = new Country("Japonia",'J');
        Country Indie = new Country("Indie",'I');
        Country USA = new Country("USA",'U');
        Country Mołdawia = new Country("Mołdawia",'M');
        Country Rumunia = new Country("Rumunia",'R');

        List<Country> countryOfSaleAudi = new ArrayList<>();
        countryOfSaleAudi.add(Polska);
        countryOfSaleAudi.add(USA);
        countryOfSaleAudi.add(Grecja);
        countryOfSaleAudi.add(Niemcy);
        countryOfSaleAudi.add(Austria);
        countryOfSaleAudi.add(Mołdawia);

        List<Country> countryOfSaleBMW = new ArrayList<>();
        countryOfSaleBMW.add(Norwegia);
        countryOfSaleBMW.add(Estonia);
        countryOfSaleBMW.add(USA);
        countryOfSaleBMW.add(Niemcy);
        countryOfSaleBMW.add(Szwecja);
        countryOfSaleBMW.add(Japonia);

        List<Country> countryOfSaleToyota = new ArrayList<>();
        countryOfSaleToyota.add(Indie);
        countryOfSaleToyota.add(USA);
        countryOfSaleToyota.add(Litwa);
        countryOfSaleToyota.add(Niemcy);
        countryOfSaleToyota.add(Rumunia);
        countryOfSaleToyota.add(Mołdawia);
        countryOfSaleToyota.add(Francja);
        countryOfSaleToyota.add(Chorwacja);

        List<Country> countryOfSaleKia = new ArrayList<>();
        countryOfSaleKia.add(Polska);
        countryOfSaleKia.add(USA);
        countryOfSaleKia.add(Grecja);
        countryOfSaleKia.add(Niemcy);
        countryOfSaleKia.add(Austria);
        countryOfSaleKia.add(Mołdawia);

        List<Country> countryOfSaleMazda = new ArrayList<>();
        countryOfSaleMazda.add(Indie);
        countryOfSaleMazda.add(USA);
        countryOfSaleMazda.add(Szwecja);
        countryOfSaleMazda.add(Chorwacja);
        countryOfSaleMazda.add(Austria);
        countryOfSaleMazda.add(Mołdawia);

        List<Country> countryOfSaleCooper = new ArrayList<>();
        countryOfSaleCooper.add(Austria);
        countryOfSaleCooper.add(Japonia);
        countryOfSaleCooper.add(Estonia);
        countryOfSaleCooper.add(Litwa);
        countryOfSaleCooper.add(Niemcy);

        Car AudiQ7 = new Car(new Producent("Audi","Q7"),true, "premium",
                new Dimension(140,200,80),countryOfSaleAudi);
        Car BMWX7 = new Car(new Producent("BMW","X7"),true, "premium",
                new Dimension(160,250,100),countryOfSaleBMW);
        Car ToyotaRav4 = new Car(new Producent("Toyota","Rav4"),true, "medium",
                new Dimension(130,180,50),countryOfSaleToyota);
        Car KiaSorento = new Car(new Producent("Kia","Sorento"),true, "medium",
                new Dimension(150,200,80),countryOfSaleKia);
        Car KiaSportage = new Car(new Producent("Kia","Sportage"),true, "standard",
                new Dimension(110,160,60),countryOfSaleKia);
        Car Mazda6 = new Car(new Producent("Mazda","6"),true, "medium",
                new Dimension(140,200,80),countryOfSaleMazda);
        Car Mazda3 = new Car(new Producent("Mazda","3"),true, "medium",
                new Dimension(100,130,40),countryOfSaleMazda);
        Car Cooper = new Car(new Producent("Cooper","Mini"),true, "premium",
                new Dimension(80,100,40),countryOfSaleCooper);
        Car AudiA6 = new Car(new Producent("Audi","A6"),true, "premium",
                new Dimension(140,180,70),countryOfSaleAudi);
        Car BMW5 = new Car(new Producent("BMW","5"),true, "premium",
                new Dimension(140,200,70),countryOfSaleBMW);


        Factory factory = new Factory();
        factory.addCars(AudiA6);
        factory.addCars(AudiQ7);
        factory.addCars(BMW5);
        factory.addCars(BMWX7);
        factory.addCars(ToyotaRav4);
        factory.addCars(KiaSorento);
        factory.addCars(KiaSportage);
        factory.addCars(Mazda3);
        factory.addCars(Mazda6);
        factory.addCars(Cooper);

        factory.printAllData();
        factory.printCountryNameFor("Audi",true,70);



    }
}
