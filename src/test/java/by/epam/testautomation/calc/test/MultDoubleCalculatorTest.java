package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class MultDoubleCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
    public Object [][] values(){
    return new Object [][]{
            {0.1,0.1,0.01},
            {-1.5,1,-1.5},
            {-1.5,-1,1.5},
            {1.5,0,0},
    };
}
    @Test(dataProvider = "valuesForTest")
    public void testMult(double a, double b, double expectedValue) {
        double result=calculator.mult(a,b);
        Assert.assertEquals(result,expectedValue);
    }
}
