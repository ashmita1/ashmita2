package Loops;

import java.util.ArrayList;

public class For_Loop {
	
//	for(Variable Initialization; Boolean_Expression Test; Increment/Decrement){
//		   //Statements
//			}
	
	public static void main(String[] args) {
		// This will print -- 0,1,2,3,4,5
//		for(int Increment = 0;Increment<=5;Increment++){
//			System.out.println("Count is  ==> " + Increment );
//		}

		System.out.println("<==== Next Count ====>");
//		 //This will print -- 5,4,3,2,1,0
//		for(int Decrement = 5;Decrement>=0;Decrement--){
//			System.out.println("Count is ==> " + Decrement );
//		}
//
//		System.out.println("<==== Next Count ====>");
//		// This will print -- 0,2,4
//		for(int Increment = 0;Increment<=5;Increment+=2){
//			System.out.println("Skip every one another  ==> " + Increment );
//		}
//		
//		
		//Enhanched for loop 
//	       // Array of String storing days of the week
//	     String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
//	     
////	     ArrayList<String> daysname = new ArrayList<>();
////	     daysname.add("Mon");
//	     
//	     
//	     ArrayList<String> daysname = new ArrayList<>();
//	     daysname.add("Mon");
//
//	 
//	     // Enhanced for loop, this will automatically iterate on the array list 
//	     for (String day : daysname) {
//	    	 if(day.equals("Mon"))
//	    	 {
//	    		 System.out.println("Days ==> "+ day);
//	    	 }
//	       
//	      }
	     
	 
//	     System.out.println("<==== Normal For Loop ====>");
//	     // Normal for loop
//	     for (int i=0; i < days.length; i++) {
//	         System.out.println("Days ==> "+ days[i]);
//	      }
//	     
	     
	     //invalid for loops
//	     int exp;
//         for(int i=1; exp ; i++){
//              System.out.println("Count is : " + i);
//         }
//         
         boolean exp = true;
         for(int i=1; exp ; i++){
              System.out.println("Count is : " + i);
         }
//	     
         
//         //Things to remember 
////         Initialization expression initializes the loop
////         Initialization expression executed once when the loop begins.
////         When the Condition expression evaluates to false, the loop terminates.
////         The Increment/Dece expression is invoked after each 
////         iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
//         
	}
	
	

}
