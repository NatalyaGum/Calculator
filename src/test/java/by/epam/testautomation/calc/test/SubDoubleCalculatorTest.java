package by.epam.testautomation.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class SubDoubleCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
    public Object [][] values(){
    return new Object [][]{
            {0.1,0.1,0},
            {-0.01,-0.01,0},
            {-0.01,0.01,-0.02},
            {0.001,-0.001,0.002},
            {0,0,0},
    };
}
    @Test(dataProvider = "valuesForTest", groups="sub")
    public void testSub(double a, double b, double expectedValue) {
        double result=calculator.sub(a,b);
        Assert.assertEquals(result,expectedValue);
    }


}
