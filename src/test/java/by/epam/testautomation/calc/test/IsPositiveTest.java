package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class IsPositiveTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {0,false},
            {-1,false},
            {1, true},
    };
}
    @Test(dataProvider = "valuesForTest" , groups="sum")
    public void testIsPositive(long a,  boolean expectedValue) {
        boolean result=calculator.isPositive(a);
        Assert.assertEquals(result,expectedValue);
    }
}
