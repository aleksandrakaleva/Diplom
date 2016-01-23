package com.diplom;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import com.diplom.applogic.ApplicationManager;
import com.diplom.model.User;
import com.diplom.util.VideoRecorder;

/**
 * Base class for TestNG-based test classes
 */
public class TestBase {
	
	User user = new User()
			.setEmail("dwqhckbp@yomail.info")
			.setPassword("123456789a")
			.setSubdomain("fortest");
	protected ApplicationManager app;
	VideoRecorder recorder = new VideoRecorder();

  @BeforeClass
  public void init() throws IOException {
	  app = new ApplicationManager();
	
      //recorder.startRecording(app.getWebDriver());
  }
  
  //@BeforeMethod
  //public void playVideo() throws IOException {
      //recorder.startRecording(app.getWebDriver());
  //}
  
  //@AfterMethod
  // void stopVideo(Method method) throws IOException {
	  //recorder.stopRecording(method.getName()).toString();
	  //ApplicationManager.saveImageAttach("C:/Tools/video.txt");
  //}
  
  
  @AfterSuite
  public void stop(){
	  app.stop();
	  //recorder.stopRecording("Test");
  }
  
}
