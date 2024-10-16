package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    @Test
    public void testCalculator1(){
        Calculator cal = new Calculator();
        Assert.assertEquals( cal.divide(10, 4), 2.5  );
    }

    @Test
    public void testCalculator2(){
        Calculator cal = new Calculator();
        Assert.assertEquals( cal.divide(4, 4), 1.0  );
    }

    @Test
    public void testCalculator3(){
        Calculator cal = new Calculator();
        Assert.assertEquals( cal.divide(0, 0), Double.NaN  );
    }


}
