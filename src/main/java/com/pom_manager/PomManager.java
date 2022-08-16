package com.pom_manager;

import com.pages.FbLoginPage;
import com.pages.LogInPage;

public class PomManager {
private LogInPage loginpage;

private FbLoginPage fbLoginPage;

public LogInPage getLoginpage() {
	return (loginpage ==null)?loginpage = new LogInPage():loginpage;
}
public FbLoginPage getFbLoginPage() {
	return (fbLoginPage ==null)?fbLoginPage = new FbLoginPage():fbLoginPage;
}	

}
