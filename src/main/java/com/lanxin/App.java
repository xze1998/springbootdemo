package com.lanxin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lanxin.controller")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);

    }
}
