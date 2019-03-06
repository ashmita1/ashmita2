package Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class removeduplicatesArray {
	
	
    public static void removeElements(int[] arr, int key) 
    { 
  
        // create an empty ArrayList 
        List<Integer> result = new ArrayList<Integer>(); 
  
        // insert all elements from the array into the list 
        // except the specified key 
        for (int i : arr) { 
            if (i != key) { 
                result.add(i); 
            } 
        } 
        // convert the list back to an array and return it 
        System.out.println(result);
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get the array 
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
  
        // Get the key 
        int key = 3; 
  
        // Remove the key 
        removeElements(array, key); 
  
      
    } 
}
