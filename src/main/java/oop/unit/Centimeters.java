package oop.unit;

public class Centimeters extends Unit{
    protected Centimeters(double value) {
        super(value, "Centimeters");
    }

    @Override
    public Unit to(Unit unitType) {
        return null;
    }

    @Override
    public Unit add(Unit otherUnit) {
        return null;
    }
}
