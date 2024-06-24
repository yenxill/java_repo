package java_w02;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 30일 입니다.
		// -----------------------------------------------------

//		System.out.println("월(달)를 입력하세요.");
//		System.out.print(" >> ");
//		
//		String month = sc.next();
//		String result = "";
//		
//		switch (month) {
//		
//		case "1월" :  case "3월" : case "5월" : case "7월" : case "8월" : case "10월" : case "12월" : 
//			result = "의 마지막 날짜는 31일 입니다.";
//			break;
//			
//		case "2월" : 
//			result = "의 마지막 날짜는 29일 입니다.";
//			break;
//			
//		case "4월" : case "6월" : case "9월" : case "11월":
//			result = "의 마지막 날짜는 29일 입니다.";
//			break;
//			
//		}
//		
//		System.out.println(month + result);
		
		
		// 동일한 조건식을 if문으로 작성해보기
		
		System.out.println("월(달) : ");
		
		int month = sc.nextInt();
		String result = "";
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 9 || month == 10 || month == 12) {
			System.out.println(month + "월은 31일 입니다.");
		} else if (month == 2) {
			System.out.println(month + "월은 29일 입니다.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "월은 30일 입니다.");
		} else {
			result = "없음";
		}

		System.out.println(result);
	}

}