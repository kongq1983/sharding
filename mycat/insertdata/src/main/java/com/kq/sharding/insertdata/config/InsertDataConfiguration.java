package com.kq.sharding.insertdata.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * InsertDataConfiguration
 *
 * @author kq
 * @date 2019-10-11
 */
@Slf4j
@Configuration
public class InsertDataConfiguration {

//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
//    public DataSourceProperties xxDS2Properties() {
//        return new DataSourceProperties();
//    }


    @Autowired
    private DataSource dataSource;

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        return dataSourceBuilder.build();
//    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }

}
