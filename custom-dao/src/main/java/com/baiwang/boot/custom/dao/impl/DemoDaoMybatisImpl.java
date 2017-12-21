package com.baiwang.boot.custom.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.baiwang.boot.custom.dao.DemoDao;

/**
 * 模板测试接口，可以删除
 * 
 * @author wuyuegang
 * 
 */
@Component
@ComponentScan(basePackages = {"com.baiwang.boot"})
public class DemoDaoMybatisImpl implements DemoDao
{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    /**
     * get product list from db
     */
    public String getProducts()
    {
        // begin time
        long start = System.currentTimeMillis();
        
        if (logger.isInfoEnabled())
        {
            logger.info("getProducts end,results[{}],cost {} ms", "test", (System.currentTimeMillis() - start));
        }
        
        return "test";
    }
    
}
