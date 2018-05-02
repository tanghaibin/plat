package com.plat.app.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author haibin.tang
 * @create 2018-05-02 上午9:22
 **/
@Component
@ConfigurationProperties(prefix = "app.datasource")
@PropertySource("classpath:application-${spring.profiles.actives}.properties")
@Data
public class DataSourceConfiguration {
    private String url;
    private String username;
    private String password;
}
