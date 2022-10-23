package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class MultLongCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {10,23,230},
            {-1,-2,2},
            {-1,2,-2},
            {4,-2,-8},
            {1,0,0},
    };
}
    @Test(dataProvider = "valuesForTest")
    public void testMult(long a, long b, long expectedValue) {
        long result=calculator.mult(a,b);
        Assert.assertEquals(result,expectedValue);
    }


}
