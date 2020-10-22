package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@MapperScan("com.example.mapper") //扫描的mapper
@SpringBootApplication	
public class App 
{
    public static void main( String[] args )
    {
            SpringApplication.run(App.class, args);
    }
}
