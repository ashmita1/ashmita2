package testNG;

import org.testng.annotations.Test;

public class Dependent {

  @Test (dependsOnMethods = { "OpenBrowser" })

  public void SignIn() {

	  System.out.println("This will execute second (SignIn)");

  }

  @Test (groups = { "Scooter" })

  public void OpenBrowser() {

	  System.out.println("This will execute first (Open Browser)");

  }
  
  @Test (groups = { "Scooter" })
  
  public void SetbrowserCapabalitiess() {

	  System.out.println("Use Version 53.0.6");
	  System.out.println("Load a profile");


  }

  @Test (dependsOnMethods = { "SignIn" })

  public void LogOut() {

	  System.out.println("This will execute third (Log Out)");

  }
}