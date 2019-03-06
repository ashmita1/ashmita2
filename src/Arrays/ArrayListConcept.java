package Arrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		//ArrayList is a class in Java
		
		ArrayList ar = new ArrayList();
		
		ArrayList<String> a = new ArrayList<>();
		
		
		ar.add(1);//0
		ar.add(2);//1
		ar.add(3);//2
		
		System.out.println(ar.size()); //size of arraylist
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.remove(3);
		ar.clear();
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.33);
		ar.add('M');
		ar.add(25);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		
		//System.out.println(ar.get(10)); //IndexOutOfBoundsException
		
		//to print all the values: use for loop:
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		// Array Size growth 
		
//		2
//
//		Lets look at this code (jdk1.8)

//		@Test
//		    public void testArraySize() throws Exception {
//		        List<String> list = new ArrayList<>();
//		        list.add("ds");
//		        list.add("cx");
//		        list.add("cx");
//		        list.add("ww");
//		        list.add("ds");
//		        list.add("cx");
//		        list.add("cx");
//		        list.add("ww");
//		        list.add("ds");
//		        list.add("cx");
//		        list.add("last");
//		    }
//		1)Put break point on the line when "last" is inserted
//
//		2)Go to the add method of ArrayList You will see

//		ensureCapacityInternal(size + 1);  // Increments modCount!!
//		        elementData[size++] = e;
//		3) Go to ensureCapacityInternal method this method call ensureExplicitCapacity
//
//		4)

//		private void ensureExplicitCapacity(int minCapacity) {
//		        modCount++;
//
//		        // overflow-conscious code
//		        if (minCapacity - elementData.length > 0)
//		            grow(minCapacity);
//		    }
//		            return true;
//		In our example minCapacity is equal to 11 11-10 > 0 therefore You need grow method
//
//		5)

//		private void grow(int minCapacity) {
//		        // overflow-conscious code
//		        int oldCapacity = elementData.length;
//		        int newCapacity = oldCapacity + (oldCapacity >> 1);
//		        if (newCapacity - minCapacity < 0)
//		            newCapacity = minCapacity;
//		        if (newCapacity - MAX_ARRAY_SIZE > 0)
//		            newCapacity = hugeCapacity(minCapacity);
//		        // minCapacity is usually close to size, so this is a win:
//		        elementData = Arrays.copyOf(elementData, newCapacity);
//		    }
		//Lets describe each step:

//		1) oldCapacity = 10 because we didn't put this param when ArrayList was init ,therefore it will use default capacity(10)
//
//		2) int newCapacity = oldCapacity + (oldCapacity >> 1); Here newCapacity is equal to oldCapacity plus oldCapacity with right shift by one (oldCapacity is 10 this is the binary representation 00001010 moving one bit to right we will get 00000101 which is 5 in decimal therefore newCapacity is 10 + 5 = 15)
//
//		3)
//
//		if (newCapacity - minCapacity < 0)
//		                newCapacity = minCapacity;
//		For example your init capacity is 1, when you add the second element into arrayList newCapacity will be equal to 1(oldCapacity) + 0 (moved to right by one bit) = 1 In this case newCapacity is less than minCapacity and elementData(array object inside arrayList) can't hold new element therefore newCapacity is equal to minCapacity
//
//		4)
//
//		if (newCapacity - MAX_ARRAY_SIZE > 0)
//		            newCapacity = hugeCapacity(minCapacity);
//		Check if array size reach MAX_ARRAY_SIZE (which is Integer.MAX - 8) Why the maximum array size of ArrayList is Integer.MAX_VALUE - 8?
//
//		5) Finally it copy old values to the newArray with length 15
	}

}
