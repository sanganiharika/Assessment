

import java.util.ArrayList;
import java.util.Collections;


public class Suffle {
	public static void series() {
		
		ArrayList<Integer>list=new ArrayList<>();
		
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			
				
		System.out.println("Before shuffle : "+list);
		Collections.shuffle(list);
		System.out.println("After shuffling : "+list);
	}
	public static void main(String[] args) {
		series();
	}

}
