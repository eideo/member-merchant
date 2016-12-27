package com.zlebank.zplatform.member.merchant.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="/spring/*.xml")
public class BaseTest {
    
    @Before
    public void print(){
        System.out.println("junit test initial success...");
    }
}
