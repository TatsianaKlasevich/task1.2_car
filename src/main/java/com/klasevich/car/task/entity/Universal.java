package com.klasevich.car.task.entity;

public class Universal extends Car {
    private CarClass carClass;

    public Universal(CarClass carClass) {
        this.carClass = carClass;
    }

    public Universal(String brand, String model, int year, Color color, CarClass carClass) {
        super(brand, model, year, color);
        this.carClass = carClass;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Universal universal = (Universal) o;

        return carClass == universal.carClass;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Universal{");
        sb.append(super.toString());
        sb.append(" carClass=").append(carClass);
        sb.append('}');
        return sb.toString();
    }
}
