package oop;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConverterTest {

    @Test
    public void itShouldConverterFiveFeetsToMeters() {
        assertEquals(Converter.feetToMeter(5), 1.524);
    }

    @Test
    public void itShouldCompareFeetsToMeters() {
        assertEquals(Converter.compareFeetToMeter(5.0, 1.524), true);
    }

    @Test
    public void itShouldConverterFiveInchesToYards() {
        assertEquals(Converter.inchToYard(5), 0.1389, 0.0001d);
    }

    @Test
    public void itShouldCompareFiveInchesToYards() {
        assertEquals(true, Converter.compareInchToYard(5, 0.1389));
    }
}