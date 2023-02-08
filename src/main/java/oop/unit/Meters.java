package oop.unit;

public class Meters extends Unit{

    static double FEET_TO_METER = 0.30479999;
    protected Meters(double value) {
        super(value, "Meters");
    }

    @Override
    public Unit to(Unit unitType) {
        if(unitType.getUnitType() == "Feets")
            return new Meters(unitType.getValue()*FEET_TO_METER);
        else throw new RuntimeException();
    }

    @Override
    public Unit add(Unit otherUnit) {
        return null;
    }
}
