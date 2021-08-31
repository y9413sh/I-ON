package quiz2;

public class MainEntry {
	public static void main(String[] args) {
		Transport[] tp = { new Bus(), new Bicycle(), new Airplane(), new Subway() };
		
		for(int i=0; i<tp.length; i++)
			tp[i].start();
		
		for(int i=0; i<tp.length; i++)
			tp[i].stop();
	}
}
