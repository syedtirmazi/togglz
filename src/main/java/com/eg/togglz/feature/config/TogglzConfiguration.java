package com.eg.togglz.feature.config;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.jdbc.JDBCStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.util.HttpServletRequestHolder;

@Configuration
public class TogglzConfiguration implements TogglzConfig
{
  @Autowired
  private DataSource dataSource;

  @Override
  public Class<? extends Feature> getFeatureClass()
  {
    return null;
  }

  @Override
  public StateRepository getStateRepository()
  {
    return new JDBCStateRepository(this.dataSource);
  }

  @Override
  public UserProvider getUserProvider()
  {
    return new UserProvider()
    {
      public FeatureUser getCurrentUser()
      {
        HttpServletRequest httpServletRequest = HttpServletRequestHolder.get();

        String userName = (String) httpServletRequest.getAttribute("userName");
        boolean isAdmin = Authenticator.isAdmin(userName);

        return new SimpleFeatureUser(userName, isAdmin);
      }
    };
  }
}
