package collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElementsArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Collections.shuffle(list);
		System.out.println("Shuffle list:"+list);
	}
}
