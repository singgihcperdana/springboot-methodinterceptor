/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jajal.test.config;

import com.jajal.test.service.TestService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author Singgih perdana
 */
@Configuration
public class TestMethodConfig {

    @Autowired
    private TestService testService;

    @Bean
    @Primary
    public ProxyFactoryBean testProxyFactoryBean() {
        ProxyFactoryBean testProxyFactoryBean = new ProxyFactoryBean();
        testProxyFactoryBean.setTarget(testService);
        testProxyFactoryBean.setInterceptorNames("testMethodInterceptor");
        return testProxyFactoryBean;
    }
}
