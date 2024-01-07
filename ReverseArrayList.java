package collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Collections.reverse(list);
		System.out.println("Reverse ArrayList:"+list);
	}
}
