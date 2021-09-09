package com.klasevich.car.task.entity;

public class Sedan extends Car {
    private CarClass carClass;

    public Sedan(CarClass carClass) {
        this.carClass = carClass;
    }

    public Sedan(String brand, String model, int year, Color color, CarClass carClass) {
        super(brand, model, year, color);
        this.carClass = carClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sedan sedan = (Sedan) o;

        return carClass == sedan.carClass;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sedan{");
        sb.append(super.toString());
        sb.append(" carClass=").append(carClass);
        sb.append('}');
        return sb.toString();
    }
}
