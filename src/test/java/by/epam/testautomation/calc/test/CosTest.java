package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "trigonometry")
public class CosTest extends BaseTest {

    @DataProvider(name="valuesForTest")
    public Object [][] values(){
        return new Object [][]{
                {Math.PI, -1.0},
                {Math.PI/3, 0.5},
                {Math.PI/2 , 0},
                {0,1}
        };
    }
    @Test(dataProvider = "valuesForTest")
    public void testCos(double a, double expectedValue) {
        double result=calculator.cos(a);
        Assert.assertEquals(result,expectedValue);
    }
}
