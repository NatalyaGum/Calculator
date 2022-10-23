package by.epam.testautomation.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

@Test(groups= "math")
public class SumLongCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {10,23,33},
            {-1,-2,-3},
            {-1,2,1},
            {4,-2,2},
            {0,0,0},
    };
}
    @Test(dataProvider = "valuesForTest" , groups="sum")
    public void testSum(long a, long b, long expectedValue) {
        long result=calculator.sum(a,b);
        Assert.assertEquals(result,expectedValue);
    }
}
