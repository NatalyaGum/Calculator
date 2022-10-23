package by.epam.testautomation.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups= "math")
public class SubLongCalculatorTest extends BaseTest{

    @DataProvider (name="valuesForTest")
public Object [][] values(){
    return new Object [][]{
            {23,10,13},
            {-1,-2,1},
            {-1,2,-3},
            {4,-2,6},
            {0,0,0},
    };
}
    @Test(dataProvider = "valuesForTest", groups="sub")
    public void testSub(long a, long b, long expectedValue) {
        long result=calculator.sub(a,b);
        Assert.assertEquals(result,expectedValue);
    }
}
