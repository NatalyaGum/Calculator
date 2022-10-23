package by.epam.testautomation.calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class IsNegativeTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {0,false},
            {-1,true},
            {1, false},
    };
}
    @Test(dataProvider = "valuesForTest" , groups="sum")
    public void testIsNegative(long a,  boolean expectedValue) {
        boolean result=calculator.isNegative(a);
        Assert.assertEquals(result,expectedValue);
    }
}
