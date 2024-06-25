package java_w02;

import java.util.Scanner;

public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로

//		int forTotal = 0;
//
//		for (int i=1; i<=10; i++) {
//			//forTotal = forTotal + i;
//			 forTotal += i;
//
//			 //System.out.println(i + " :: " + forTotal);
//		}
//
//		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

//		int w = 1;
//		int whileTotal = 0;
//
//		while (w <= 100) {
//			whileTotal = whileTotal + w;
//			// whileTotal += w;			
//			w++;
//
//			//System.out.println(w + " :: " + whileTotal);
//		}
//
//		System.out.println("while total ==== " + whileTotal);
//		System.out.println();
		
		
		// (for) 1~100까지의 정수 중 6의 배수 출력
		for (int i=1; i<=100; i++) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
		}
			
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
		int k = 6;
		
		while(k <= 100) {
			if (k % 6 == 0) {
				System.out.println("[while 6의 배수]" + k + " ");
			}
			
			k++;
		}
		
		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		System.out.println("[(for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력]");
		for (int d=6; d<=200; d++) {
			if(d % 6 == 0  && d % 12 != 0) {
				System.out.println(d + "");
			}
		}
		
		
		
		System.out.println();
		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		int e = 1;
		
		while (e <= 200) {
			if (e % 6 == 0 && e % 12 != 0) {
				System.out.print(e + " ");
			}
			
			e++;
		}
		
		System.out.println();
		// (for) 1~60000까지의 정수 중 100의 배수는 몇개 일까요?
		int cnt = 0;
		
		for (int i=1; i<=60000; i++) {
			if(i % 100 == 0) {
				cnt++;
			}
		}
		System.out.println("(for) 1~60000까지의 정수 중 100의 배수는 " + cnt + " 입니다.");
		
		// (while) 1~60000까지의 정수 중 100의 배수는 몇개 일까요?
		int f = 1;
		int fFnt = 0;
		
		while (f <= 60000) {
			if( f % 100 == 0) {
				fFnt++;
			}
			
			f++;
		}
		
		System.out.println("(while) 1~60000까지의 정수 중 100의 배수는 " + fFnt + " 입니다.");
	}
		
	
	
}