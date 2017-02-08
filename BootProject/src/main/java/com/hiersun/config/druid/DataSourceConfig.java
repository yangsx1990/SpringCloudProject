package com.hiersun.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by liubaocheng on 2016/11/14.
 */
@Configuration
@PropertySource("classpath:cfg/${spring.profiles.active}/mysql.properties")
public class DataSourceConfig {
    private Logger logger = LoggerFactory
            .getLogger(DataSourceConfig.class);

    @Value("${druid.master.url}")
    private String url;
    @Value("${druid.master.username}")
    private String username;
    @Value("${druid.master.password}")
    private String password;
    @Value("${druid.master.driver_class_name}")
    private String driver_class_name;
    @Value("${druid.master.initialSize}")
    private int initialSize;
    @Value("${druid.master.minIdle}")
    private int minIdle;
    @Value("${druid.master.maxActive}")
    private int maxActive;
    @Value("${druid.master.maxWait}")
    private long maxWait ;
    @Value("${druid.master.minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;
    @Value("${druid.master.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;
    @Value("${druid.master.validationQuery}")
    private String validationQuery;
    @Value("${druid.master.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${druid.master.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${druid.master.testOnReturn}")
    private boolean testOnReturn;
    @Value("${druid.master.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${druid.master.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${druid.master.filters}")
    private String filters;
    @Value("${druid.master.connectionProperties}")
    private Properties connectionProperties;

    @Bean(destroyMethod = "close", initMethod = "init", name = "dataSource")
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver_class_name);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setValidationQuery(validationQuery);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestOnReturn(testOnReturn);
        druidDataSource.setPoolPreparedStatements(poolPreparedStatements);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//        druidAbstractDataSource.setFilters(filters);
//        druidAbstractDataSource.setConnectProperties(connectionProperties);
        return druidDataSource;
    }



}
