
package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class Car {
    private String model;
    private String manufacturer;
    private String color;

    public Car() {
    }

    public Car(String model, String manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public List<Car> getCarsList() {
        List<Car> carOnService = new ArrayList<>();
        carOnService.add(new Car("Prius","Toyota", "White"));
        carOnService.add(new Car("Lancer", "Mitsubishi Motors", "Red"));
        carOnService.add(new Car("Trueno AE86", "Toyota", "White"));
        carOnService.add(new Car("Leaf", "Nissan", "Blue"));
        carOnService.add(new Car("RAV4", "Toyota", "Grey"));
        return carOnService;
    }
}