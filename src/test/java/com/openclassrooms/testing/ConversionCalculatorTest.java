package com.openclassrooms.testing;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@Tag("ConversionTests")
public class ConversionCalculatorTest {

    private ConversionCalculator calculatorUnderTest = new ConversionCalculator();


    @Tag("FahrenheitTests")
    @Tag("TemperatureTests")
    @DisplayName("Given zero degrees in celsius When converted to Fahrenheit Then the result is 32")
    @Test
    public void celsiusToFahrenheit_returnsAFahrenheitTempurature_whenCelsiusIsPositive() {
        Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0 );
        assertThat( actualFahrenheit, is(equalTo(32.0)) );
    }


    @Tag("TemperatureTests")
    @DisplayName("Given 32 degrees in Fahrenheit when converted to celsius Then the result is zero")
    @Test
    public void fahrenheitToCelsius() {
        Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
        assertThat( actualCelsius, is(equalTo(0.0)));
    }

    @Test
    public void litresToGallons() {
        Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
        assertThat( actualLitres, is(equalTo(1.0)));
    }

    @Test
    public void radiusToAreaOfCircle() {
        Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
        assertThat( actualArea, is(equalTo(PI)));
    }
}