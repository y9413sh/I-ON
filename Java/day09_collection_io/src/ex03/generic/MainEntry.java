package ex03.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<>();
		String[] str = {"abc", "kbs", "dirotor"};
		
		t1.set(str);
		t1.print();
		
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer[] num = {1,2,3,4,5};
		t2.set(num);
		t2.print();
		
		GenericEx<Double> t3 = new GenericEx<>();
		Double[] db = {1.2,2.3,3.4,4.5,5.6};
		t3.set(db);
		t3.print();
	}
}
