//intersection of two arraylist returns comman element or substring 
package collection.com;

import java.util.ArrayList;

public class IntersectionArrayList {

	public static void main(String[] args) {
		        ArrayList<Integer> list1 = new ArrayList();
		        list1.add(10);
		        list1.add(40);
		      
		        ArrayList<Integer> list2 = new ArrayList();
		        list2.add(30);
		        list2.add(40);

		        list1.retainAll(list2);

		        System.out.println("Intersection of two ArrayLists: " + list1);
		    }

	}

