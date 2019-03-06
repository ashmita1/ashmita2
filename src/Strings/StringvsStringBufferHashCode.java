package Strings;

public class StringvsStringBufferHashCode {
	
	public static void main(String args[]){  
//        System.out.println("Hashcode test of String:");  
//        String str="java";  
//        System.out.println(str.hashCode());  
//        str=str+"tpoint";  
//        System.out.println(str.hashCode());  
//   
//        System.out.println("Hashcode test of StringBuffer:");  
//        StringBuffer sb=new StringBuffer("java");  
//        System.out.println(sb.hashCode());  
//        sb.append("tpoint");  
//        System.out.println(sb.hashCode());  
        
//        String name = "Scala"; //1st String object
//        String name_1 = "Scala"; //same object referenced by name variable
//        String name_2 = new String("SCala"); //different String object
//
//        //this will return true
//        if(name==name_1){
//        System.out.println("both name and name_1 is pointing to same string object");
//        }
//
//        //this will return false
//        if(name.equals(name_2)){
//        System.out.println("both name and name_2 is pointing to same string object");
//        }else {
//        	System.out.println("else");
//        }


       // Read more: https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html#ixzz5fSZegPo4
        
        
        String name = "Java"; //1st String object
        //String name_1 = "Java"; //same object referenced by name variable
        String name_2 = new String("Java") ;//different String object

        if(name.equals(name_2)){
        System.out.println("name and name_2 are equal String by equals method");
        }

        //this will return false
        if(name==name_2){
        System.out.println("name and name_2 are equal String by equals method");
        }
        else {
        	System.out.println("not true");
        }
        
        
//        String str1 = "Java is best programming language";
//
//        if(str1.indexOf("Java") != -1){
//             System.out.println("String contains Java at index :" + str1.indexOf("Java"));
//        }
//
//        if(str1.matches("J.*")){
//             System.out.println("String Starts with J");
//        }
//
//        str1 ="Do you like Java ME or Java EE";
//
//        if(str1.lastIndexOf("Java") != -1){
//              System.out.println("String contains Java lastly at: " + str1.lastIndexOf("Java"));
//        }

       // Read more: https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html#ixzz5fSa0U96N
        
    }  

}
