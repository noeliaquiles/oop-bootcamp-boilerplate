package oop.unit;

public class Yards extends Unit{

    protected Yards(double value) {
        super(value, "Yards");
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
