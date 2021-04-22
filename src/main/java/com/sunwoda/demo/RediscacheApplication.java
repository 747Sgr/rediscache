package com.sunwoda.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 2007130280
 */
@SpringBootApplication
@MapperScan("com.sunwoda.demo.dao")
public class RediscacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RediscacheApplication.class, args);
    }

}
