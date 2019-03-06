package Loops;

public class Continue_Loop {
	
	public static void main(String[] args) {

		// This will print -- 0,1,2,4,5
		for(int Count = 0;Count<=5;Count++){			
			if(Count==3){
				continue;				
				}
			System.out.println("Count is ==> " + Count);
			}

		// This will just print -- 3
		System.out.println("<==== Next Count ====>");
		for(int Count = 0;Count<=5;Count++){
			if(Count==3){
				System.out.println("Count is ==> " + Count);
				continue;				
				}
			}
		
		
		
		
		//illegal 
		
		String str = "www.c4learn.com";

        int max = str.length();
        int count = 0;

        continue;

        System.out.println("Hello continue");
        
        
        //don't use inside if when not part of the loop 
        
        String str1 = "www.c4learn.com";

        int max1 = str.length();
        int count1 = 0;

        if(str1.charAt(i) != 'p')
            continue;

        System.out.println("Hello continue");
		
		}

}
