package OnlyForTesting;

import Static.Classhelper14;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Test1 {
    public void door(){
        Classhelper14 no = new Classhelper14();
        int result = no.go();
        int exceptres=23;
        Assert.assertEquals(result,exceptres);
        System.out.println("Test will pass");
    }
}
