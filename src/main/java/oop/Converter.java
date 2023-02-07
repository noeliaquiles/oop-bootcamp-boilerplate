package oop;

import java.text.DecimalFormat;

public class Converter {
    public static double feetToMeter(double feet) {
        return feet*0.3048;
    }

    public static boolean compareFeetToMeter(double feet, double meter) {
        return feetToMeter(feet) == meter;
    }

    public static double inchToYard(double inch) {
        return inch * 0.0278;
    }

    public static boolean compareInchToYard(double inch, double yard) {
        return Math.abs(inchToYard(inch) - yard) < 0.0001;
    }
}
