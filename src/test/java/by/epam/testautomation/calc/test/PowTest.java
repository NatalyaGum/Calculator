package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class PowTest extends BaseTest {
    @DataProvider(name="valuesForTest")
    public Object [][] values(){
        return new Object [][]{
                {2.,2.0,4.0},
                {-1.5,1,-1.5},
                {5.0,1.5,11.18},
                {1.5,0,1}
        };
    }
    @Test(dataProvider = "valuesForTest")
    public void testPow(double a, double b, double expectedValue) {
        double result=calculator.pow(a,b);
        Assert.assertEquals(result,expectedValue);
    }

    @DataProvider (name="valuesForExceptionTest")
    public Object [][] value(){
        return new Object [][]{
                {-1.5,1.5}
        };
    }

    @Test(dataProvider = "valuesForExceptionTest", expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testExceptionPow(double a, double b) {
        calculator.pow(a,b);
    }
}
