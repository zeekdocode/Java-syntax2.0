package classes;
public class Car {

    public String brand = null;
    public String model = null;
    public String color = null;

    public Car() {
    }

    public Car(String theBrand, String theModel, String theColor) {
        this.brand = "toyota";
        this.model = "civic";
        this.color = "red";

        System.out.println("i car the i have is"+brand+model+color );

    }

}