package java_01; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		String var = "닭";
		String var2 = "소";
		String food = "치킨";
		String food1 = "스테이크";
		
		System.out.println("가져오신 동물은 " + var + "이므로, " + food + "(를) 요리하겠습니다.");
		System.out.println("가져오신 동물은 " + var2  + "이므로, " + food1 + "(를) 요리하겠습니다.");
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
		
		int varNum = 3;
		int varResult = varNum % 2;
		boolean numFlag;
		
		numFlag = varResult == 0;
		
		System.out.println("입력하신 숫자 " + varNum + "은(는)");
		
		
		/*
		 [ 평균 구하기 ]
		 
		 입력한 값: 국어, 영어, 수학
		 조건1) 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격/ 미만이면 불합격
		 조건2) 평균 점수는 소수점 자리까지 표시
		 
		 결과물 예시 :
		 당신의 국어 점수는 85점입니다.
		 당신의 영어 점수는 90점입니다.
		 당신의 수학 점수는 60점입니다.
		 
		 당신의 평균 점수는 78.33 이고, 불합격입니다.
		 */
		
		String subject1 = "국어";
		String subject2 = "영어";
		String subject3 = "수학";
		
		float num1 = 85;
		float num2 = 90;
		float num3 = 61;
		float inResult;
		float intResult = (num1 + num2 + num3)/3;
		
		
		
		String intResult1;
		intResult1 = (intResult  > 85 ) ? "합격" : "불합격";
		
		
		System.out.println("당신의 평균의 점수는 " + intResult + " 이고 " + intResult1 + "입니다");
		
		int p1 = 85;
		int p2 = 90;
		int p3 = 61;
		String p5 = "";
		
		float p4 = (float)(p1+p2+p3)/3;
		
		p5 = ( p4 > 85 ) ? "합격" : "불합격";
		System.out.println("당신의 평균점수는 " + p4 + " 이고, " + p5 + "입니다");
		
		
		
		


	}
}
