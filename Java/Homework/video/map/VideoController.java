package video.map;

import java.util.HashMap;
import java.util.Set;

public class VideoController extends Video{
	static HashMap<String, Video> map = new HashMap<String, Video>();
	static int top = 1;
	
	public static void modify() {
		System.out.print("�����Ͻ� ���� ������ �Է��� �ּ��� : ");
		String title = scan.next();
		String category = map.get(title).category;
		
		if(map.containsKey(title)){
			map.put(title, new Video(title, category));
			System.out.println("����Ǿ����ϴ�.");
		}else{
			System.out.println("���� ������ �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
	}
	
	public static void delete() {
		System.out.print("�����Ͻ� ���� ������ �Է��� �ּ��� : ");
		String title = scan.next();
		if(map.containsKey(title)){
			map.remove(title);
			System.out.println("�����Ǿ����ϴ�.");
		}else{
			System.out.println("���� ������ �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
	}
	
	public static void print() {
		System.out.println("�����ϰ� �ִ� ���� ���� : " + top);
		System.out.println("���� ����---�帣---�뿩����---�뿩��---�뿩��¥");
		Set<String> set = map.keySet();
		for(String video : set){
			String title = map.get(video).title;
			String category = map.get(video).category;
			String lend = map.get(video).lend;
			if(lend.equalsIgnoreCase("y")){
				lend = "�뿩";
			}else{
				lend = "�뿩����";
			}
			String lendName = map.get(video).lendName;
			if(lendName==null){
				lendName = "���� ����";
			}
			String lendDate = map.get(video).lendDate;
			if(lendDate == null){
				lendDate = "���� ����";
			}
			System.out.println(title + "\t" + category + "\t" + lend +
					"\t" + lendName + "\t" + lendDate);
		}
	}
	
	public static void insert() {
		System.out.print("���� ������ �Է��ϼ��� : ");
		String title = scan.next();
		System.out.print("�帣�� �Է��ϼ��� : ");
		String category = scan.next();
		map.put(title, new Video(title, category));
		top++;
	}
}//class