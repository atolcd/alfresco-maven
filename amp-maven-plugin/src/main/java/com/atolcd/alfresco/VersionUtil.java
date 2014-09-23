package com.atolcd.alfresco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionUtil {

  private static final Pattern PATTERN = Pattern.compile("\\d+(\\.\\d+)*");

  public static String getFinalVersion(String version) {
    // clean up version for Alfresco
    Pattern pattern = PATTERN;
    Matcher matcher = pattern.matcher(version);
    if (!matcher.find()) {
      // No valid version found in finalVersion
      return null;
    }
    return matcher.group();
  }
}
