package com.openclassrooms.testing;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@Tag("ConversionTests")
@DisplayName("We should be able to convert between different units.")
public class ConversionCalculatorTest {
    private ConversionCalculator calculatorUnderTest = new ConversionCalculator();

    @Nested
    @Tag("TemperatureTests")
    @DisplayName("We should be able to covert between Fahrenheit and Celsius")
    class TemperatureTests {
        @Tag("FahrenheitTests")
        @DisplayName("Given zero degrees in celsius When converted to Fahrenheit then the result is 32")
        @Test
        public void celsiusToFahrenheit_returnsAFahrenheitTempurature_whenCelsiusIsPositive() {
            Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0 );
            assertThat( actualFahrenheit, is(equalTo(32.0)) );
        }

        @DisplayName("Given 32 degrees in Fahrenheit when converted to celsius then the result is zero")
        @Test
        public void fahrenheitToCelsius() {
            Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
            assertThat( actualCelsius, is(equalTo(0.0)));
        }
    }

    @Test
    @DisplayName("Given a volume in litres when converted to gallons then the result is rounded up")
    public void litresToGallons() {
        Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
        assertThat( actualLitres, is(equalTo(1.0)));
    }

    @Test
    @DisplayName("Given a radius of one when converted then the result is Pi")
    public void radiusToAreaOfCircle() {
        Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
        assertThat( actualArea, is(equalTo(PI)));
    }
}