package com.my.jenkins.demo;

import org.testng.Assert;

/**
 * mmw
 * 2021/1/13
 */
public class Test {
    @org.testng.annotations.Test
    public void case1(){
        Assert.assertEquals(1,1);
    }
@org.testng.annotations.Test
    public void case2(){
        Assert.assertEquals("hello","hello");
    }
}
