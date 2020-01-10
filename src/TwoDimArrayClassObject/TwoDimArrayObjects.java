package TwoDimArrayClassObject;

import java.util.ArrayList;

public class TwoDimArrayObjects {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("red");
		color.add("yellow");
		color.add("green");
		color.add("orange");
		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
			
			System.out.println(color.get(2));
		}

	}

}
