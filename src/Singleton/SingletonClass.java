package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonClass {
	
	
	    private static SingletonClass instance=null;
	    //private WebDriver driver;


	    private SingletonClass(){

	    }

	    
	    public static SingletonClass getInstance(){
	        if(instance==null){
	            instance = new SingletonClass();
	        }
	        return instance;
	    }

}
