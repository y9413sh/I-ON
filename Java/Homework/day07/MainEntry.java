package homework;

public class MainEntry {
	public static void main(String[] args) {
		Employee[] em = { new Regular("홍길동","010-1111-2222","인사","과장",2000000),
						new Sales("홍동길", "010-3333-4444", "영업", "사원", 2000000, 3),
						new PartTime("길홍동", "010-5555-6666", "파트타임", "알바", 20, 8) };
		for(int i=0; i<em.length; i++) {
			System.out.println(em[i].toString());
		}
		
	}
}
