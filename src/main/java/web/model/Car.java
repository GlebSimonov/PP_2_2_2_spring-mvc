package web.model;

public class Car {
    private String model;
    private int series;
    private String colour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car() {
    }

    public Car(String model, int series, String classCar) {
        this.model = model;
        this.series = series;
        this.colour = classCar;
    }
}
