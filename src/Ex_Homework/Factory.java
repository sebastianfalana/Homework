package Ex_Homework;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    public void addCars(Car car){
            cars.add(car);

    }

    public void printAllData(){
        for (Car car :
                cars) {

                System.out.println("\n"+car.producent.name+" "+car.producent.model+", skrzynia automatyczna: "+car.isAutomaticGear+", segment: "+car.segment+
                        ", wymiary: wysokość "+car.dimensions.high+", szerokość "+car.dimensions.width+", pojemność bagażnika "+car.dimensions.trankCapacity+" litrów,"+
                        "\nKraje sprzedaży: ");
            for (Country country :
                    car.getCountriesOfSale()) {
                System.out.println(country.getCountryName() + "-" + country.getCountrySign());
            }
        }
    }

    public void printCountryNameFor(String producentName, boolean isAutomaticGear, int tankCapacity) {
        for (Car car :
                cars) {
            if(car.getProducent().getName()==producentName && car.isAutomaticGear==isAutomaticGear && car.getDimensions().trankCapacity ==tankCapacity) {
                for (Country country :
                        car.countriesOfSale) {
                    System.out.println(country.countryName+"-"+country.countrySign);
                }
            }
        }
    }
}
