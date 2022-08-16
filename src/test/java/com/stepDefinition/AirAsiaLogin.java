package com.stepDefinition;

import java.util.HashMap;
import java.util.List;
import org.testng.Assert;

import com.pom_manager.PomManager;
import com.resources.DataDriven;
import com.resources.GenericLibrary;
import io.cucumber.java.en.*;

public class AirAsiaLogin extends GenericLibrary {
	GenericLibrary generic = new GenericLibrary();
	static int testRow = 1;
	String path = System.getProperty("user.dir") + loadProperties("AirAsiaLogin");
	String sheetname = loadProperties("AirAsiaLoginSheetName");
	List<HashMap<String, String>> testData = DataDriven.readDataExcel(path, sheetname);
	PomManager pommanager = new PomManager();
	
	
	 @Given("^User launch the  Application \"([^\"]*)\"$")
	    public void user_launch_the_application_something(String url) throws Throwable {
		 getUrl(testData.get(testRow).get(url));
	    }

	 @When("^User login into the application with \"([^\"]*)\",\"([^\"]*)\"$")
	    public void user_login_into_the_application_with_somethingsomething(String MOBILENO, String PASSWORD) throws Throwable {
	      dynamicWait(3);
	      sendText(pommanager.getFbLoginPage().getUserName(), testData.get(testRow).get(MOBILENO));
	      sendText(pommanager.getFbLoginPage().getPassword(), testData.get(testRow).get(PASSWORD));
	    }
	
}
