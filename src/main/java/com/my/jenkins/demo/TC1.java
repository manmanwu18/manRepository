package com.my.jenkins.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * mmw
 * 2021/1/13
 */
public class TC1 {
    @Test
    public void case1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void case2(){
        Assert.assertEquals("hello","hello");
    }
    @Test
    public void case3(){
        Assert.assertEquals("hello1","hello1");
    }
}
