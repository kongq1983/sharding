package com.kq.sharding.insertdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * InsertDataApplication
 *
 * @author kq
 * @date 2019-10-11
 */

@SpringBootApplication
public class InsertDataApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(InsertDataApplication.class, args);
    }

}
