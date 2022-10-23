package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class DivDoubleCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
    public Object [][] values(){
    return new Object [][]{
            {0.1,0.1,1},
            {-1.5,1,-1.5},
            {-1.5,-1,1.5},
            {5,2,2.5}
    };
}
    @Test(dataProvider = "valuesForTest")
    public void testDiv(double a, double b, double expectedValue) {
        double result=calculator.div(a,b);
        Assert.assertEquals(result,expectedValue);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testExceptionDiv() {
        double result=calculator.div(1.5,0.0);
    }

}
