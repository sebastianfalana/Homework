package Ex_Homework;

public class Producent {
    String name;
    String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Producent(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
