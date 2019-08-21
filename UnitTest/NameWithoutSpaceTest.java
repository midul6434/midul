package UnitTest;

import CollectionframworkC15.NameWithoutSpace;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NameWithoutSpaceTest {
     public void  findsomething(){
        NameWithoutSpace obj = new NameWithoutSpace();
        String actualresult=obj.roll();
       String expectedresult="abulkuddus";
         Assert.assertEquals(actualresult,expectedresult);
    }
@Test
public void nothingtosay(){
    NameWithoutSpace obj = new NameWithoutSpace();
    String actualresult = obj.now();
    String expectedresult="MidulTalukder";
    Assert.assertEquals(actualresult,expectedresult);
}









}
