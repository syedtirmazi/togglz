package com.eg.togglz.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.togglz.core.repository.jdbc.JDBCStateRepository;

@Configuration
public class DbConfig
{
  @Value("${spring.datasource.driver-class-name}")
  private String driverClassName;

  @Value("${spring.datasource.username}")
  private String userName;

  @Value("${spring.datasource.password}")
  private String password;

  @Value("${spring.datasource.url}")
  private String url;

  @Bean(name = "togglzDataSource")
  public DataSource getDataSource()
  {
    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

    driverManagerDataSource.setDriverClassName(this.driverClassName);
    driverManagerDataSource.setUrl(this.url);
    driverManagerDataSource.setUsername(this.userName);
    driverManagerDataSource.setPassword(this.password);

    return driverManagerDataSource;
  }

  @Bean(name = "togglzRepo")
  public JDBCStateRepository getJdbcRepository()
  {
    JDBCStateRepository jdbcStateRepository = new JDBCStateRepository(getDataSource());
    return jdbcStateRepository;
  }
}
