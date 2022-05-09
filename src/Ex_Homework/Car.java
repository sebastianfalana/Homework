package Ex_Homework;

import java.util.List;

public class Car {
    Producent producent;
    boolean isAutomaticGear;
    String segment;
    Dimension dimensions;
    List<Country> countriesOfSale;

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        isAutomaticGear = automaticGear;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public List<Country> getCountriesOfSale() {
        return countriesOfSale;
    }

    public void setCountriesOfSale(List<Country> countriesOfSale) {
        this.countriesOfSale = countriesOfSale;
    }

    public Car(Producent producent, boolean isAutomaticGear, String segment, Dimension dimensions, List<Country> countriesOfSale) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        this.dimensions = dimensions;
        this.countriesOfSale = countriesOfSale;
    }
}
