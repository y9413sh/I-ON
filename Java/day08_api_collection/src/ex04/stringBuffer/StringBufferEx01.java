package ex04.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("length / capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + " / " + size);
		
		sb.append("kosa");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + " / " + size);
		
		sb.append("happyvirus");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + " / " + size);
		
		sb.append("189163513s");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + " / " + size);
		
		sb.append("189163513asds");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + " / " + size);
		
		sb.trimToSize();
		len = sb.length(); size = sb.capacity();
		System.out.println(len + " / " + size);
	}
}
