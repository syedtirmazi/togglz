package com.eg.togglz.feature.config;

import org.springframework.stereotype.Component;

@Component
public class Authenticator
{
  private static final String adminUser = "ADMIN";

  public static boolean isAdmin(String userName)
  {
    return (adminUser.equalsIgnoreCase(userName));
  }
}
