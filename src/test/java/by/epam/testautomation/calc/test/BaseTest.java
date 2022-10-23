package by.epam.testautomation.calc.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

@Test(groups = "base")
public class BaseTest {
    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
