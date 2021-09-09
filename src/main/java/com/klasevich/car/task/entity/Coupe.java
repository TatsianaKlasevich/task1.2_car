package com.klasevich.car.task.entity;

public class Coupe extends Car {
    private int maxSpeed;

    public Coupe(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Coupe(String brand, String model, int year, Color color, int maxSpeed) {
        super(brand, model, year, color);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Coupe coupe = (Coupe) o;

        return maxSpeed == coupe.maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coupe{");
        sb.append(super.toString());
        sb.append(" maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}
