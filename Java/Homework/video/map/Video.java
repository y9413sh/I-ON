package video.map;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Video {
	protected String title; //��������
	protected String category; //�帣
	protected String lend; //�뿩����
	protected String lendName; //�뿩��(����)
	protected String lendDate; //���ó�¥
	static Scanner scan = new Scanner(System.in);
	
	public Video() {}
	
	
	public Video(String title, String category) {
		this.title = title;
		this.category = category;
		System.out.print("�뿩 ���θ� �Է��ϼ��� <Y/N>: ");
		this.lend = scan.next();
		if(this.lend.equalsIgnoreCase("y")){
			System.out.print("�뿩��(����)�� �Է��ϼ��� : ");
			this.lendName = scan.next();
			this.lendDate = todayDate();//���� ��¥ �Էµ�
		}
	} // constructor end
	
	public void input(String title){
		//return video;
	}

	private String todayDate() {
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		SimpleDateFormat today;
		today = new SimpleDateFormat("yy-MM-dd EEEE");
		return today.format(day);
	}
}//class