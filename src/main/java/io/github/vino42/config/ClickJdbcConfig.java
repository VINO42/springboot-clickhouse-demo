package io.github.vino42.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

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
@ConfigurationProperties(prefix = "click")
public class ClickJdbcConfig {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
    
    private Integer initialSize;
    private Integer maximumPoolSize;
    private Integer minimumIdle;
    private Integer maxWait;
    
    public String getDriverClassName() {
        return driverClassName;
    }
    
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Integer getInitialSize() {
        return initialSize;
    }
    
    public void setInitialSize(Integer initialSize) {
        this.initialSize = initialSize;
    }
    
    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }
    
    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }
    
    public Integer getMinimumIdle() {
        return minimumIdle;
    }
    
    public void setMinimumIdle(Integer minimumIdle) {
        this.minimumIdle = minimumIdle;
    }
    
    public Integer getMaxWait() {
        return maxWait;
    }
    
    public void setMaxWait(Integer maxWait) {
        this.maxWait = maxWait;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
