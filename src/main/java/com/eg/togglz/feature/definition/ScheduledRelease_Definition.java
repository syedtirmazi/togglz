package com.eg.togglz.feature.definition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;

@FeatureGroup
@Label("Monhtly Scheduled Release")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ScheduledRelease
{
  //
}

public enum ScheduledRelease_Definition implements Feature
{
  @ScheduledRelease
  @Label("Feature - Edge1")
  FEATURE_EDGE1,

  @ScheduledRelease
  @Label("Feature - Edge2")
  FEATURE_EDGE2,

  @ScheduledRelease
  @Label("Feature - Edge3")
  BUGFIX_EDGE3,

  @ScheduledRelease
  @EnabledByDefault
  @Label("Hotfix - Edge4")
  HOTFIX_EDGE4;
}
