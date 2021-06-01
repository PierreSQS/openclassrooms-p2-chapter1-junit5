package com.openclassrooms.testing;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@Tag("ConversionTests")
@DisplayName("We should be able to convert between different units.")
class ConversionCalculatorTest {
    private final ConversionCalculator calculatorUnderTest = new ConversionCalculator();

    @Nested
    @Tag("TemperatureTests")
    @DisplayName("We should be able to covert between Fahrenheit and Celsius")
    class TemperatureTests {
        @Tag("FahrenheitTests")
        @DisplayName("Given zero degrees in celsius When converted to Fahrenheit then the result is 32")
        @Test
        void celsiusToFahrenheit_returnsAFahrenheitTempurature_whenCelsiusIsPositive() {
            Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0 );
            assertThat( actualFahrenheit, is(equalTo(32.0)) );
        }

        @DisplayName("Given 32 degrees in Fahrenheit when converted to celsius then the result is zero")
        @Test
        void fahrenheitToCelsius() {
            Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
            assertThat( actualCelsius, is(equalTo(0.0)));
        }
    }

    @Test
    @DisplayName("Given a volume in litres when converted to gallons then the result is rounded up")
    void litresToGallons() {
        Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
        assertThat( actualLitres, is(equalTo(1.0)));
    }

    @Test
    @DisplayName("Given a radius of one when converted then the result is Pi")
    void radiusToAreaOfCircle() {
        Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
        assertThat( actualArea, is(equalTo(PI)));
    }

    @Test
    @DisplayName("Given 1000.0 m when converted then return 1.0 Km")
    void metersToKilometers() {
        Double expected = 1.0;
        Double actualMeters = calculatorUnderTest.metersToKilometers(1000.0);
        assertThat(actualMeters,is(equalTo(expected)));
    }
}