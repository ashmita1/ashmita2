package JavaSessions;

import java.util.Arrays;

public class Assignments {

	public static void main(String[] args) {
		 int year=2020;
		 String month="June";
		 int days=0;
		 switch(month){
		 case "January" :
		 case "March" :
		 case "May" :
		 case "July" :
		 case "August" :
		 case "October" :
		 case "December":
		 days=31;
		 break;
		
		 case "April" :
		 case "June" :
		 case "September" :
		 case "November" :
		 days=30;
		 break;
		
		 case "February":
		 if(year%4==0 && year%100!=0 || year%400==0){
		 days=29;
		 }else
		 days=28;
		 break;
		 default :
		 System.out.println("Invalid options");
		 }
		 System.out.println("Number of days in "+month+" is "+days);

		System.out.println("---------------------");

		int[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;
		// Move all other elements to beginning
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != key) {
				arr[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr)); 

	}
	
	public static int[] removeElements(int[] arr, int key) 
    { 
          // Move all other elements to beginning  
          int index = 0; 
          for (int i=0; i<arr.length; i++) 
             if (arr[i] != key) 
                arr[index++] = arr[i]; 
  
         // Create a copy of arr[]  
         return Arrays.copyOf(arr, index); 
    } 

}
