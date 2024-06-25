package java_w02;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		
		int dan = 1;
		
		while (dan <= 9) {
			System.out.println("[while]" + dan + " 단");
			
			int hang = 1;
			while (hang <=9) {
				int result = 0;
				
				result = dan * hang;
				System.out.println(dan + " * " + hang + " = " + result);
				
				hang++;
				
			}
			
			dan++;
		}
		
		System.out.println();
		
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		for (int dan1 = 1; dan <= 9; dan++) {
			
			System.out.println("[for] " + dan + " 단");
			
			for (int hang=1; hang <=9; hang++) {
				int result = 0;
				result = dan * hang;
				
				System.out.println(dan + " * " + hang + " = " + result);
			}
		}

		
	}

}