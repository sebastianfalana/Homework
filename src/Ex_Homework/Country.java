package Ex_Homework;

public class Country {
    String countryName;
    char countrySign;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public void setCountrySign(char countrySign) {
        this.countrySign = countrySign;
    }

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }
}