package com.example.multipledatasource.common.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "oracleDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.oracle") // application.properteis中对应属性的前缀
    public DataSource oracleDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mysqlDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.mysql") // application.properteis中对应属性的前缀
    public DataSource mysqlDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oracleJdbcTemplate")
    public JdbcTemplate oracleJdbcTemplate(@Qualifier("oracleDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "mysqlJdbcTemplate")
    public JdbcTemplate mysqlJdbcTemplate(@Qualifier("mysqlDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
