package io.github.vino42.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * =====================================================================================
 *
 * @Created :   2021/7/31 15:56
 * @Compiler :   jdk 8
 * @Author :   VINO
 * @Description :
 *
 * =====================================================================================
 */
@Configuration
public class HikaricpConfig {
    @Autowired
    private ClickJdbcConfig clickJdbcConfig;
    
    
    @Bean
    public DataSource dataSource() {
        HikariDataSource datasource = new HikariDataSource();
        datasource.setJdbcUrl(clickJdbcConfig.getUrl());
        datasource.setDriverClassName(clickJdbcConfig.getDriverClassName());
        datasource.setMaximumPoolSize(clickJdbcConfig.getMaximumPoolSize());
        datasource.setMinimumIdle(clickJdbcConfig.getMinimumIdle());
        return datasource;
    }
    
}
