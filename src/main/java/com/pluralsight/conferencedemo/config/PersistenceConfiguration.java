package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        var dataSourceConfig = DataSourceBuilder.create();
        dataSourceConfig.url("jdbc:postgresql://localhost:5432/conference_app");
        dataSourceConfig.username("postgres");
        dataSourceConfig.password("Welcome");
        return dataSourceConfig.build();
    }
}
