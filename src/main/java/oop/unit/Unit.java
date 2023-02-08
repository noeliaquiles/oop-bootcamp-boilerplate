package oop.unit;

import java.util.Objects;

abstract public class Unit {

        public final double COMPARISON_TOLERANCE = 0.0001;

        private double value;
        private final String unitType;


        protected Unit (double value, String unitType){
            this.value = value;
            this.unitType = unitType;
        }

        public double getValue(){
            return value;
        }

        public void setValue(double value){
            this.value = value;
        }

        public String getUnitType(){
            return unitType;
        }

        abstract public Unit to(Unit otherUnit);

        public abstract Unit add(Unit otherUnit);

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
            Unit otherUnit = (Unit) o;
            return Math.abs(otherUnit.to(this).value - this.value) < COMPARISON_TOLERANCE;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, unitType);
        }
}
