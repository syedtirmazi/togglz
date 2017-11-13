package com.eg.togglz.feature.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.togglz.core.Feature;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;

@FeatureGroup
@Label("Project - Gain on Prior")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface GainOnPrior
{
  //
}

public enum GainOnPrior_Definition implements Feature
{
  @GainOnPrior
  @Label("Feature - GOP 1")
  FEATURE_GOP1,

  @GainOnPrior
  @Label("Feature - GOP 2")
  FEATURE_GOP2;
}
