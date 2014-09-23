package com.atolcd.alfresco;

import org.junit.Assert;

import junit.framework.TestCase;

public class VersionUtilTest extends TestCase {

  public void testGetFinalVersionRelease() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("1.2.3"));
  }
  public void testGetFinalVersionSnapshot() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("1.2.3-SNAPSHOT"));
  }
  public void testGetFinalVersionGitDescribe() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("1.2.3-3-f5d5s2"));
  }
  public void testGetFinalVersionCleanBefore() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("foo1.2.3"));
  }
  public void testGetFinalVersionAfter() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("1.2.3bar"));
  }
  public void testGetFinalVersionBoth() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("foo.1.2.3bar"));
  }
  public void testGetFinalVersionTwoVersion() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("1.2.3foo4.5"));
  }
  public void testGetFinalVersionComplexOne() throws Exception {
    Assert.assertEquals("1.2.3", VersionUtil.getFinalVersion("foo1.2.3.bar464"));
  }
  public void testGetFinalVersionComplexTwo() throws Exception {
    Assert.assertEquals("123", VersionUtil.getFinalVersion("foo123.bar464"));
  }
}
