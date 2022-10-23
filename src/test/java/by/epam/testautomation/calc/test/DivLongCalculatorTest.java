package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class DivLongCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {10,2,5},
            {-1,-2,0},
            {-1,2,0},
            {4,-2,-2},

    };
}
    @DataProvider (name="valuesForExceptionTest")
    public Object [][] value(){
        return new Object [][]{
                {1,0},
        };
    }
    @Test(dataProvider = "valuesForTest")
    public void testDiv(long a, long b, long expectedValue) {
        long result=calculator.div(a,b);
        Assert.assertEquals(result,expectedValue);
    }

    @Test(dataProvider = "valuesForExceptionTest", expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testExceptionDiv(long a, long b) {
        calculator.div(a,b);
    }
}
