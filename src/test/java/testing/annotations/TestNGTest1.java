package testing.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest1 {

    @Test
    public void Test1(){
        System.out.println("Hello Test NG");
    }

    @Test
    public void Test4(){
        System.out.println("Test method four");
    }

    @BeforeMethod // Pre - conditions
    public void Test2(){
        System.out.println("Before method");
    }

    @AfterMethod // Post - conditions
    public void Test3(){
        System.out.println("After method");
    }
}
