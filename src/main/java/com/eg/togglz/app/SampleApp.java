package com.eg.togglz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

import com.eg.togglz.feature.definition.J875_Decomission_Definition;

@RestController
public class SampleApp
{
  @Autowired
  private FeatureManager featureManager;

  @RequestMapping(method = RequestMethod.GET, value = "/do")
  String doSomething()
  {
    if (this.featureManager.isActive(J875_Decomission_Definition.FEATURE_F1))
    {
      return "Sending MM to PS";
    }

    return "You didn't do anything";
  }
}
