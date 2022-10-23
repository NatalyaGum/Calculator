package by.epam.testautomation.calc.test;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Test(groups = "timeout")
public class TimeoutTest {

    protected Timeout timeout;

    @BeforeMethod
    public void setUp() {
        timeout = new Timeout();
    }

    @DataProvider(name="valuesForTest")
    public Object [][] values(){
        return new Object [][]{
                {2},
                {0},
                {5}
        };
    }

    @Test(dataProvider = "valuesForTest")
    public void testSleep(int time) {
        long startTime = System.nanoTime();
        timeout.sleep(time);
        long actualTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime);
        Assert.assertEquals(actualTime,time);
    }

    @AfterMethod
    public void tearDown() {
        timeout = null;
    }
}


