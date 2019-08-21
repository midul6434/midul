package UnitTest;


import Array_list.ArrayListDemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayListDemoTest {

    @Test
    public void findElementIndexBasedOnElementNameTest(){
        ArrayListDemo obj = new ArrayListDemo();

        int actualIndexNumber =  obj.findElementIndexBasedOnElementName("Ahad");

        int expectedIndexNumber = 3;

        Assert.assertEquals(actualIndexNumber,expectedIndexNumber );


    }
   @Test
   public void  findElementNameBasedOnFirstLetter(){
       ArrayListDemo no = new ArrayListDemo();
       char actualname=no.findElementNameBasedOnFirstLetter('R');
       char expectedname='R';
       Assert.assertEquals(actualname,expectedname);

   }
    }




