package Loops;

import java.util.ArrayList;

public class Break_Loop {

	public static void main(String[] args) {

		ArrayList<String> array1 = new ArrayList<>();
		array1.add("Mon");
		array1.add("Mon1");
		array1.add("Mon2");
		array1.add("Mon3");
		array1.add("Mon4");
		array1.add("Mon5");
		array1.add("Mon6");
		array1.add("Mon7");
		array1.add("Mon8");
		array1.add("Mon9");
		array1.add("Mon10");

		for (int i = 0; i < array1.size(); i++) {

			System.out.println("Array values :" + array1.get(i));

			if (array1.get(i).equals("Mon9")) {
				System.out.println("hi");

			}

		}

		//
		// // This will print -- 0,1,2,3,4,5
		// for(int Count = 0;Count<=10;Count++){
		// if(Count==6){
		// break;
		// }
		// }
		// System.out.println("You have exited the loop");
		// }
	}

}
