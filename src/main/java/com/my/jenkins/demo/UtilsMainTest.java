package com.my.jenkins.demo;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class UtilsMainTest {
 
    @BeforeClass
    public void say(){
        System.out.println("我是前置类");
    }
 
    @Test
    public void testAdd() throws Exception {
        UtilsMain um = new UtilsMain();
        assertEquals(um.add(4,4),8);
    }

    //减法
    @Test
    public void testDec() throws Exception {
        UtilsMain um = new UtilsMain();
        assertEquals(3,um.desc(8,5));
    }
    @BeforeMethod
    public void go1(){
        System.out.println("我是前置方法");
    }
    @AfterMethod
    public void go2(){
        System.out.println("我是后置方法");
    }
    @AfterClass
    public void say2(){
        System.out.println("我是后置类");
    }
    @Test(timeOut = 1)
    public void testTime(){
        System.out.println("123");
        int i =0;
        while(i<1000000000){
            i++;
        }
    }
    @Test(expectedExceptions = NullPointerException.class)
    public void testSub(){
        System.out.println("456");
        throw new NullPointerException();
    }
    @Test(dependsOnMethods = {"testTime","testSub"})
    public void testMethond(){
        System.out.println(0);
    }
 
    @DataProvider(name="user")
    public Object[][] getStr(){
        return new Object[][]{
                { "", "", "账号不能为空" },
                { "admin"," " ,"密码不能为空" },
                { " ", "a123456","账号不能为空" },
                { "ad ", "123456","账号“ad”不存在" },
                { "admin","12345" ,"密码错误" },
        };
    }
    @Test(dataProvider = "user")
    private void sout(String uname,String pword,String msg){
        System.out.println(uname+"->"+pword+"->"+msg);
 
    }
  
}