package Construtor;

public class Car_Example_2 {
	//Class Member Variables & Fields
	
	private int small;
	String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;
    
    
    
    //Constructor with values passed
    public Car_Example_2(String Model, int Make,boolean LeftHandDrive , int Small )
    {
    	small = Small;
    	sModel = Model;
    	iMake = Make;
    	bLeftHandDrive = LeftHandDrive;
    }
    
    public Car_Example_2(int tyres) {
    	iTyres = tyres;
    }

    //Method
    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);
    	System.out.println("Transmission of the Car: " +  small);


    }
}
class Example {
    
    public static void main(String[] args) {
    	 //Use the Car keyword to declare Car Class variable
    	                //Passing values to the constructor
    	 Car_Example_2 Toyota = new Car_Example_2("Camry",2014,true,1);
    	 
    	 Toyota.iDoors = 4;
    	 Toyota.iGear = 5;
    	 Toyota.iHighestSpeed = 200;
    	 Toyota.iTyres = 4;
    	 Toyota.sColor = "Black";
    	 Toyota.sTransmission = "Manual";
    	 //Toyota.small = 1;
    	 
    	 //Using Car class method
    	 Toyota.DisplayCharacterstics();
    	 
    	 }

}
