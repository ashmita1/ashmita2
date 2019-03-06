package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Sample";

		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);

		// Reverse using String builder

		StringBuilder builder = new StringBuilder();

		builder.append(input);
		builder = builder.reverse();
		System.out.println(builder);

//		String Sampple = "Sampple"; 
//        char[] temparray = Sampple.toCharArray(); 
//        int left, right=0; 
//        right = temparray.length-1; 
//  
//        for (left=0; left < right ; left++ ,right--) 
//        { 
//            // Swap values of left and right 
//            char temp = temparray[left]; 
//            temparray[left] = temparray[right]; 
//            temparray[right]=temp; 
//        } 
//  
		int numbers[] = {20, 20, 30, 40, 50, 50, 50};
		
		 int o = 0;
		    for (int i = 0; i < numbers.length; i++) {
		        if (numbers[i] != 50) {
		            numbers[o++] = numbers[i];
		        }
		    }

	}

}
