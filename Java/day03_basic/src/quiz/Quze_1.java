package quiz;

public class Quze_1 {
	
	public static void main(String[] args) {
		//1. 변수 선언 	
		int pay = 567890;
		int man, chun, back, sip ;  //몫 변수
		int m_na, ch_na, b_na;   // 나머지 변수
		
		//2. 메세지출력 및 입력 
		//3. 처리(계산)
		man = pay / 10000; 			m_na = pay % 10000;
		chun = m_na / 1000;		ch_na = m_na % 1000;
		back = ch_na / 100;			b_na = ch_na % 100;
		sip = b_na / 10;
		
		//4. 결과출력(화면)
		System.out.println("\n\n만원: " + man +"장\n천원: " + chun + "장\n백원: " + back + "개\n십원: " + sip + "개");
		System.out.println("\n10000: " + pay / 10000 +
									"장\n1000: " + (pay % 10000) / 1000 + 
									"장\n100: " + ((pay % 10000) % 1000) / 100 + 
									"개\n10: " + (((pay % 10000) % 1000) % 100 ) /10 + "개");
	}
	

}















