package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "math")
public class SqrtTest extends BaseTest {

    @DataProvider(name = "valuesForTest")
    public Object[][] values() {
        return new Object[][]{
                {4.5, 2.1213203435596424},
                {4.0, 2},
                {0, 0.0}
        };
    }

    @Test(dataProvider = "valuesForTest")
    public void testSqrt(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue);
    }

    @DataProvider(name = "valuesForExceptionTest")
    public Object[][] value() {
        return new Object[][]{
                {-5.5}
        };
    }

    @Test(dataProvider = "valuesForExceptionTest", expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testExceptionSqrt(double a) {
        calculator.sqrt(a);
    }
}
