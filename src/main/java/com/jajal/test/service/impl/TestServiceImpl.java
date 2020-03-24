/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jajal.test.service.impl;

import com.jajal.test.service.TestService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Singgih perdana
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void testMethod() {
        System.out.println("testService String");
    }

}
