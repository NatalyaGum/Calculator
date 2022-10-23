package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "trigonometry")
public class SinTest extends BaseTest {

    @DataProvider(name="valuesForTest")
    public Object [][] values(){
        return new Object [][]{
                {Math.PI,0},
                {Math.PI/6,0.5},
                {Math.PI/2.0,1.0},
                {0,0}
        };
    }
    @Test(dataProvider = "valuesForTest")
    public void testSin(double a, double expectedValue) {
        double result=calculator.sin(a);
        Assert.assertEquals(result,expectedValue);
    }
}
