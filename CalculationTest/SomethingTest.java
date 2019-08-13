package CalculationTest;

import UnitTest.TestHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SomethingTest {
    public void addtest() {
        TestHelper obj = new TestHelper();
        int actualresult=obj.add(4,5);
        System.out.println(actualresult);
        int exceptresult=9;
        Assert.assertEquals(actualresult,exceptresult);
        System.out.println("Test pass");
    }
@Test
public void divtest(){
    TestHelper obj = new TestHelper();
    int actualresult=obj.abs(3,5);
    System.out.println("Result"+ actualresult);
    int exceptedresult=15;
    Assert.assertEquals(actualresult,exceptedresult);
    System.out.println("test will pass");


}





}
