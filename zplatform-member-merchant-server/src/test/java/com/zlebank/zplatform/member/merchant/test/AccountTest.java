/* 
 * AccountTest.java  
 * 
 * version TODO
 *
 * 2016年11月7日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.merchant.test;



import org.junit.Test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zlebank.zplatform.member.coopinsti.bean.CoopInsti;
import com.zlebank.zplatform.member.coopinsti.service.CoopInstiService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年11月7日 上午9:26:46
 * @since 
 */
//@Component
public class AccountTest extends BaseTest{
    
    @Reference(version="1.0")
    private CoopInstiService coopInstiServie;
    @Test
    public void accountQuery(){
        
       try {                                                    
           CoopInsti coopInsti= coopInstiServie.getInstiByInstiCode("300000000000027");
           System.out.println(coopInsti);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
   
}
