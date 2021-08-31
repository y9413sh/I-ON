package ex08.staticMember;

class Atm {
	int count;
	static int total;
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	
	public static void view() {
		//count += amount;
		total = total+100;
	}
	
	public static void show(int count, int total) {
//		this.count=count;
//		this.total=total;
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}



public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		
		Atm at = new Atm(1000);
		at.display();
		System.out.println("-----------------");
		Atm at2 = new Atm(2000);
		at2.display();
		System.out.println("-----------------");
		Atm at3 = new Atm(3000);
		at3.display();
		System.out.println("-----------------");
	}
}
