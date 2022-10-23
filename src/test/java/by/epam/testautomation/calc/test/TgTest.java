package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "trigonometry")
public class TgTest extends BaseTest {

    @DataProvider(name = "valuesForTest")
    public Object[][] values() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI, 0},
                {Math.PI / 3, 1.73205},
                {0, 0}
        };
    }

    @Test(dataProvider = "valuesForTest")
    public void testTg(double a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue);
    }

    @DataProvider(name = "valuesForExceptionTest")
    public Object[][] value() {
        return new Object[][]{
                {Math.PI / 2}
        };
    }

    @Test(dataProvider = "valuesForExceptionTest", expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testExceptionTg(double a) {
        calculator.tg(a);
    }
}
