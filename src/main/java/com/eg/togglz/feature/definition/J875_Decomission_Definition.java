package com.eg.togglz.feature.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.togglz.core.Feature;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;

@FeatureGroup
@Label("Project - J875 Decomission")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface J875_Decomission
{
  //
}

public enum J875_Decomission_Definition implements Feature
{
  @J875_Decomission
  @Label("Feature - Send MM to PS")
  FEATURE_F1,

  @J875_Decomission
  @Label("Feature - FM Settlement Automation")
  FEATURE_F2;
}
