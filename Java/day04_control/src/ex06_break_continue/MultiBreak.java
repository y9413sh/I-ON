package ex06_break_continue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;

		firust : {    
			second : {
					third : 	{

						int k = 100;
						System.out.println("Before the break");

						if( flag ) break second;   // break 식별자;   식별자 위치까지 탈출 

						System.out.println("This won't execute ");

				} // third end		
					System.out.println("th160 홧팅!!!");
			} //second end
				System.out.println("This is after second block");				
		} // firust end
		
		System.out.println("의미없는~38242934");	
	}
}
