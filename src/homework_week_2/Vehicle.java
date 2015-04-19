package homework_week_2;

public class Vehicle {
    private String brand;
    private String model;
    private String type;
    private String color;

    public Vehicle(String brand, String model, String type, String color) {
        this.brand = brand;
        this.model=model;
        this.type=type;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show (Vehicle ts){
        System.out.println (
                ts.getBrand()+" "+
                ts.getModel()+" "+
                ts.getType()+" "+
                ts.getColor());
    }

    public void findModel (Vehicle ts){
        System.out.println ("The model " +ts.getModel()+" brand "+ts.getBrand());
    }

}
