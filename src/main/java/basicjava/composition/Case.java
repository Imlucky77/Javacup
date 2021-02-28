package basicjava.composition;

public class Case {
    private String model;
    private String manufacturer;
    private int powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacturer, int powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerBotton() {
        System.out.println("Power Button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
