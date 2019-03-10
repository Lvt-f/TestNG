package imooctest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
    @BeforeClass(alwaysRun = true)
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @Test(groups = {"cars","suv"})
    public void testBMWX6(){
        System.out.println("Running Test-->BMW X6");
    }
    @Test(groups = {"cars","sedan"})
    public void testAudiA6(){
        System.out.println("Running Test-->Audi A6");
    }
    @Test(groups = {"bick"})
    public void testNinja(){
        System.out.println("Running Test-->Kawasaki Ninja");
    }
    @Test(groups = {"bick",})
    public void testHondaCBR(){
        System.out.println("Running Test-->Honda CBR");
    }
    //alwaysRun分组时可以强行让此类一只跑下去
    @AfterClass(alwaysRun = true)
    public void AfterClass(){
        System.out.println("AfterClass");
    }
}
