package oop.unit;

public class Inches extends Unit{

    public Inches(double value) {
        super(value, "Inches");
    }

    @Override
    public Unit to(Unit unit) {
        if(unit.getUnitType() == "Meters")
            return new Inches(DistanceConvert.toInches(unit.getValue()));
        else throw new RuntimeException();
    }

    @Override
    public Unit add(Unit otherUnit) {
        return new Inches(getValue() + to(otherUnit).getValue());
    }
}
