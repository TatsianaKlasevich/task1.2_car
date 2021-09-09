package com.klasevich.car.task.entity;

public class Hatchback extends Car {
    public int doorNumber;

    public Hatchback(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public Hatchback(String brand, String model, int year, Color color, int doorNumber) {
        super(brand, model, year, color);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hatchback hatchback = (Hatchback) o;

        return doorNumber == hatchback.doorNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + doorNumber;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hatchback{");
        sb.append(super.toString());
        sb.append(" doorNumber=").append(doorNumber);
        sb.append('}');
        return sb.toString();
    }
}
