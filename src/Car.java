public class Car {
    private int cylinders;
    private String plate;
    private String brand;
    private String model;

    public Car(String brand, String model, int cylinders, String plate) {
        this.cylinders = cylinders;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String toString() {

        return brand + " " + model + " " + cylinders + " " + plate;
    }
}