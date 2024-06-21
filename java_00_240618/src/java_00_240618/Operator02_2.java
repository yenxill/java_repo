package java_00_240618;

public class Operator02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		비교 연산자
		- >, >=, <, <=, ==(equals), !=(not equals)
		(=은 대입자이기 때문에 == 두번 씀)
		- 2항 연산자
		- 피연산자들의 우위(동등) 비교하는 연산자
		- 피연산자는 숫자형을 가진다.
		- 연산의 결과가 항상 boolean이다.

	 */
		
		// >, >=, <, <=, ==(equals), !=(not equals)
		int a = 100;
		int b = 50;
		int c = 1;
		
		// 1.a가 b보다 클까요?
		//System.out.println(a + " > " + b +  " = " + (a>b));
		System.out.println(a > b);
		
		// 2.b가 c보다 크거나 같을까요?
		//System.out.println(b + " >= " + c  + " = " + (b>=c));
		System.out.println(b>=c);

		// 3.a가 c보다 작을까요?
		//System.out.println(a + " < " + c  + " = " + (a<c));
		System.out.println(a<c);
		
		// 4.a가 b보다 작거나 같클까요?
		//System.out.println(b + " >= " + c  + " = " + (b>=c));
		System.out.println(a<=b);
		
		// 5.a와 b가 같을까요?
		//System.out.println(b + " >= " + c  + " = " + (b>=c));
		System.out.println(a==b);
		
		// 6.a와 a가 다를까요?
		//System.out.println(b + " >= " + c  + " = " + (b>=c));
		System.out.println(a|=b);

		// 7.b와 c가 다를까요?
		System.out.println(b|=c);
		
		
		//사용자 나이 입력 - 19세 이상 통과, 미만 거절
		//true(통과), false(거절)
		int age = 10;
		boolean ageResult;
		
		ageResult = age >= 19;
		
		System.out.println("나이 : " + age);
		System.out.println("결과 : " + ageResult);
		
		
		//숫자 입력 - 짝수인지, 아닌지 판단
//		int num = 10;
//		int numResult;
//		numResult = num % 2;
//		System.out.println(numResult);
		
		
		int varNum = 10;
		int varResult = varNum % 2;
		boolean numFlag;
		
		numFlag = varResult == 0;
		System.out.println(varNum + "는 짝수 입니다." + numFlag );
		

	}

}
