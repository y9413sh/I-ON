package ex05.utilPackage;

import java.util.Date;
import java.util.StringTokenizer;
import java.util.Calendar;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //system이 갖고 있는 날짜 얻어옴
		
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH)+1 + "월");
		System.out.println(c.get(Calendar.DATE) + "일");
		
		System.out.println("\n\n");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + ":" + m + ":" + s);
		
		StringTokenizer st = new StringTokenizer("박정희/전두환/노태우/김영삼", "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
