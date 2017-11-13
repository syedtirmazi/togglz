package com.eg.togglz.feature.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.togglz.core.Feature;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;

@FeatureGroup
@Label("Project - GeoTab")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface GeoTab
{
  //
}

public enum GeoTab_Definition implements Feature
{
  @GeoTab
  @Label("Feature - It does something")
  FEATURE_G1,

  @GeoTab
  @Label("Feature - This too")
  FEATURE_G2;
}
