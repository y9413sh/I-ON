package homework;

public class MainEntry {
	public static void main(String[] args) {
		Employee[] em = { new Regular("ȫ�浿","010-1111-2222","�λ�","����",2000000),
						new Sales("ȫ����", "010-3333-4444", "����", "���", 2000000, 3),
						new PartTime("��ȫ��", "010-5555-6666", "��ƮŸ��", "�˹�", 20, 8) };
		for(int i=0; i<em.length; i++) {
			System.out.println(em[i].toString());
		}
		
	}
}
