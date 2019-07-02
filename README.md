# Java Testing: Part 2 - Chapter 1
## Supporting JUnit5 Examples
* You can run the tests with `mvn clean test`
* These examples are fully described in my Openclassrooms course on Achieving Quality Through Testing in Java.
* Run just the conversion tests with `mvn test -Dgroups='ConversionTests'`
  * _Have a look at ConversionCalculatorTest and see how this matches the `@Tag` annotation!_
* Explore the code. You'll have to run the tests in your IDE to see the power of @DisplayName 

## A Fun Challange
* Have a go at modifying ConversionCalculatorTest to convert miles to kilometers. You can find the conversion 
factor online! Write your test first and modify the ConversionCalcualtor
* It will be similar to the Celsius to Fahrenheit conversion which is already there!
