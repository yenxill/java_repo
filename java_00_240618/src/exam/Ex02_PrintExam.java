package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intVal1 = 12;
		int intVal2 = 25;
		String intVal3 = "크리스마스";
		System.out.println( intVal1 + "월 " + intVal2 + "일 " + intVal3 + "입니다.");
		
		String intVal4 = "2023";
		float intVal5 = 72.893f;	
		System.out.println( "작년 " + intVal4 + "년도 대학 합격률은 " + intVal5 + "퍼센트 였습니다.");
		
		int intVal6 = 100;
		int intVal7 = 10;
		System.out.println( intVal6 + "이라는 숫자에 " + intVal7 + "을 더하면 " + (intVal6+intVal7) + "이 됩니다.");
		
		Double intVal8 = 3.141592653589793d;
		int intVal9 = 5;
		System.out.println( "원주율은 " + intVal8 + "이고, 반지름이 " + intVal9 + "인 원의 둘레는 " + (intVal8*intVal9*2) + "입니다.");
	
		int intVal0 = 5;
		Double intVal11 = 78.53981633974483d;
		System.out.println("반지름이 " + intVal0 + "인 원의 넓이는 " + intVal11 + "입니다.");
		
		char c = '뭵';
		int intstr7 = c;
		System.out.println(c + "의 문자번호는 " + intstr7 + " 입니다." );
		
		float intf2 = 58.78945f;
		int intssd1 = (int) intf2;
		System.out.println(intf2 + "를 버림 하면 " + intssd1 + " 입니다." );

	
	}

}
