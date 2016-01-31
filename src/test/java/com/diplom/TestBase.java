package com.diplom;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import com.diplom.applogic.ApplicationManager;
/**
 * Base class for TestNG-based test classes
 */
public class TestBase {
	
	protected ApplicationManager app;

  @BeforeClass
  public void init() throws IOException {
	  app = new ApplicationManager();
  }
  
  
  @AfterSuite
  public void stop(){
	  app.stop();
  }
  
}
