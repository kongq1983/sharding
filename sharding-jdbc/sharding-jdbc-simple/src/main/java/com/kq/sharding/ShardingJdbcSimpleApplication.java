package com.kq.sharding;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShardingJdbcSimpleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShardingJdbcSimpleApplication.class, args);
        System.out.println(context);
    }

}
