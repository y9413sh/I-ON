package ex05.utilPackage;

import java.util.Date;
import java.util.StringTokenizer;
import java.util.Calendar;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //system�� ���� �ִ� ��¥ ����
		
		System.out.println(c.get(Calendar.YEAR) + "��");
		System.out.println(c.get(Calendar.MONTH)+1 + "��");
		System.out.println(c.get(Calendar.DATE) + "��");
		
		System.out.println("\n\n");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("���� �ð��� " + h + ":" + m + ":" + s);
		
		StringTokenizer st = new StringTokenizer("������/����ȯ/���¿�/�迵��", "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
