package testngTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonTest {

    @BeforeSuite
    public static  void boforeSuite(){
        System.out.println("This is before from amazon");
    }

    @Test
    public void amazonTest1(){
        System.out.println("Amazon test 1");
    }
@Test
    public void amazonTest2(){
        System.out.println("Amazon test 2");
    }
@Test
    public void amazonTest3(){
        System.out.println("Amazon test 3");
    }
}
