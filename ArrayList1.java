//Reversing each char of the word without changing position
package collection.com;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		String s="Hello I am here";
		String[] words=s.split(" ");
		
		 ArrayList<String> s1=new ArrayList();
		 for(String Word:words) {
			 StringBuilder revWord=new StringBuilder(Word).reverse();
			 s1.add(revWord.toString());
		 }

		String revString=String.join(" ",s1);
		System.out.println(revString);
	}
}
