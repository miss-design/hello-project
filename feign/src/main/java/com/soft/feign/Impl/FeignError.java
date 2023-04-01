package com.soft.feign.Impl;

import com.soft.entity.Student;
import com.soft.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findALL() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
