package homework.lamdas_lesson;

import lombok.AllArgsConstructor;
import lombok.Builder;

public class SupplierConsumer {
    public static void main(String[] args) {
        var car = new Car.CarBuilder();
        car.model("model1").color("red").engine(2.4).build();
    }
}


@AllArgsConstructor
@Builder
class Car {
    private String model;
    private String color;
    private double engine;
}
