package testNG;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	 @DataProvider(name="SearchProvider")
	  public Object[][] getDataFromDataprovider(ITestContext m){
		 if(m.getName().equalsIgnoreCase("testMethod")){
		        return new Object[][] {
		                { "Guru99", "India" },
		                { "Krishna", "UK" },
		                { "Bhupesh", "USA" }
		            };}
		        else{
		        return new Object[][] {
		                { "Canada" },
		                { "Russia" },
		                { "Japan" }
		            };}       
		    }
}
