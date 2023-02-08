package oop.unit;

import java.util.Objects;

public class DistanceConvert {
    public final double COMPARISON_TOLERANCE = 0.0001;


    enum ConversionFactors {
        YARD_TO_METER(0.91440276),
        FEET_TO_METER(0.30479999),
        INCH_TO_METER(0.02539999),
        CENTIMETER_TO_METER(0.01);

        public final double factor;

        private ConversionFactors(double factor) {
            this.factor = factor;
        }
    }

    private final double valueInMetres;

    private DistanceConvert(double valueInMetres) {
        this.valueInMetres = valueInMetres;
    }

    public static DistanceConvert fromMeter(double valueInMetres) {
        return new DistanceConvert(valueInMetres);
    }

    public double toMeters() {
        return valueInMetres;
    }

    public static DistanceConvert fromYards(double lengthInYards) {
        return new DistanceConvert(lengthInYards * ConversionFactors.YARD_TO_METER.factor);
    }

    public double toYards() {
        return valueInMetres / ConversionFactors.YARD_TO_METER.factor;
    }

    public static DistanceConvert fromFeet(double lengthInFeet) {
        return new DistanceConvert(lengthInFeet * ConversionFactors.FEET_TO_METER.factor);
    }

    public static DistanceConvert fromInches(double lengthInInches) {
        return new DistanceConvert(lengthInInches * ConversionFactors.INCH_TO_METER.factor);
    }

    public static double toInches(double value) {
        return value / ConversionFactors.INCH_TO_METER.factor;
    }

    public static DistanceConvert fromCentimeter(double lengthInCentimeters) {
        return new DistanceConvert(lengthInCentimeters * ConversionFactors.CENTIMETER_TO_METER.factor);
    }

    public DistanceConvert plus(DistanceConvert otherLength) {
        return new DistanceConvert(valueInMetres + otherLength.toMeters());
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        DistanceConvert otherLength = (DistanceConvert) otherObj;
        return Math.abs(otherLength.valueInMetres - valueInMetres) < COMPARISON_TOLERANCE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueInMetres);
    }
}
