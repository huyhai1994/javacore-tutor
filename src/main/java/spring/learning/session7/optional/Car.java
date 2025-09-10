package spring.learning.session7.optional;

import java.util.Optional;

public class Car {
    private Optional<Insurance> insurance;

    public static void main(String[] args) {
        Optional<Car> optCar = Optional.ofNullable(null);
        System.out.println(optCar.get());
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
