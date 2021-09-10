package com.klasevich.car.task.entity;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private final Map<Car, Integer> carMap;

    public Garage() {
        carMap = new HashMap<>();
    }

    public void parkCar(Car car) {
        if (car != null && carMap.containsKey(car)) {
            carMap.put(car, carMap.get(car) + 1);

        } else {
            carMap.put(car, 1);
        }
        System.out.println(car + "has been parked");
    }

    public void exitCar(Car car) {
        if (carMap.containsKey(car)) {
            carMap.replace(car, carMap.get(car) - 1);

            if (carMap.containsValue(0)) {
                carMap.remove(car, 0);
            }
            System.out.println(car + " has been deleted");

        } else {
            System.out.println("Sorry,this car (" + car + ") hasn't been parked in the garage");
        }
        System.out.println();
    }

    public void showAllCars() {
        carMap.forEach((key, value) -> System.out.println(key + " ---> " + value));
        System.out.println();
    }

    public void findCarNumber(Car car) {
        if (carMap.containsKey(car)) {
            Integer value = carMap.get(car);
            System.out.println(value + " is the number of " + car);

        } else {
            System.out.println("The garage doesn't contain this car " + car);
        }
    }
}


