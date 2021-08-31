package quiz;

import ex04.Abstract.Circle;
import ex04.Abstract.Rectangle;
import ex04.Abstract.Shape;
import ex04.Abstract.Triangle;

public class MainEntry {
	public static void main(String[] args) {
		Transport[] tr = { new Subway(), new Bus(), new Bicycle(), new Airplane() };
		
		tr[0]=new Subway();
		tr[1]=new Bus();
		tr[2]=new Bicycle();
		tr[3]=new Airplane();

		for(int i=0; i<tr.length; i++) {
			tr[i].start();
		}
		
		for(int i=0; i<tr.length; i++) {
			tr[i].stop();
		}
	}
}
