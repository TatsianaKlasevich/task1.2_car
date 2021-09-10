package com.klasevich.car.task.main;

import com.klasevich.car.task.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Coupe("BMV", "6", 2011, Color.BLACK, 220));
        cars.add(new Coupe("Audi", "A5", 2013, Color.WHITE, 240));
        cars.add(new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 200));
        cars.add(new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 200));
        cars.add(new Coupe("Honda", "Legend", 2014, Color.BLACK, 250));
        cars.add(new Hatchback("Lexus", "CT200h", 2010, Color.RED, 3));
        cars.add(new Hatchback("Nissan", "leaf", 2010, Color.RED, 5));
        cars.add(new Hatchback("Audi", "A1", 2016, Color.YELLOW, 3));
        cars.add(new Hatchback("Honda", "Civic", 2005, Color.RED, 5));
        cars.add(new Sedan("Lexus", "GS350", 2014, Color.BLUE, CarClass.E));
        cars.add(new Sedan("JAGUAR", "XF", 2014, Color.BLACK, CarClass.D));
        cars.add(new Sedan("JAGUAR", "XF", 2014, Color.BLACK, CarClass.D));
        cars.add(new Sedan("Nissan", "Fuga", 2009, Color.BLUE, CarClass.B));
        cars.add(new Sedan("Mercedes-Benz", "CLS-Class", 2014, Color.WHITE, CarClass.C));
        cars.add(new Universal("Hyundai", "i40", 2014, Color.RED, CarClass.B));
        cars.add(new Universal("Kia", "Optima", 2018, Color.GREEN, CarClass.B));
        cars.add(new Universal("Scoda", "Superb", 2010, Color.RED, CarClass.C));
        cars.add(new Universal("Honda", "Shuttle", 2012, Color.GREY, CarClass.D));

        //filling the garage
        Garage garage = new Garage();
        for (Car car : cars) {
            garage.parkCar(car);
        }

        Car car1 = new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 200);
        Car car2 = new Universal("Hyundai", "i40", 2014, Color.RED, CarClass.B);
        garage.parkCar(car1);
        garage.parkCar(car2);

//        garage.showAllCars();

        //one of three car has been deleted
        garage.exitCar(new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 200));

        // try to delete car, which doesn't exist
        garage.exitCar(new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 100));

        garage.showAllCars();

        garage.findCarNumber(new Coupe("Mercedes-Benz", "CL-Class", 2015, Color.GREEN, 200));

        //finding cars' number which hasn't been parked
        garage.findCarNumber(new Coupe("Mercedes-Benz", "CFKL-Class", 2015, Color.GREEN, 100));
    }
}
