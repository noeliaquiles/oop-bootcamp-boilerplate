package oop.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class UnitTest {
    public void itShouldBeAbleToCompareFeetAndMeter() {
        assertEquals(new Feets(5), new Meters(1.52399995));
    }

    @Test
    public void itShouldBeAbleToCompareFeetAndMeterNotBeingEqual() {
        assertNotEquals(new Feets(6), new Meters(1.52399995));
    }

    @Test
    public void itShouldBeAbleToCompareInchesAndYard() {
        assertEquals(new Yards(5), new Inches(180.00064008));
    }

    @Test
    public void itShouldBeAbleToCompareCentimetersAndMeters() {
        assertEquals(new Meters(2), new Centimeters(200));
    }


    @Test
    public void itShouldBeAbleToAddInchesToInches() {
        assertEquals(new Inches(2).add(new Inches(2)).getValue(), 4d);
    }

    @Test
    public void itShouldBeAbleToAddMetersToInches() {
        assertEquals(new Inches(2).add(new Meters(1)).getValue(), 41.37008d, 41.37009424019458);
    }
}