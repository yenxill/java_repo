package memberMng;

import java.util.List;
import java.util.Scanner;

public class MemberService {

	MemberDAO mDAO;
	Scanner sc = new Scanner(System.in);

	public MemberService() {
		mDAO = new MemberDAO();
	}

	// ===== 회원 관리 프로그램 =====
	// 1. 회원 정보 등록
	// 2. 회원 정보 수정
	// 3. 회원 정보 삭제
	// 4. 회원 정보 출력(이름)
	// 5. 회원 전체 정보 출력
	// 6. 프로그램 종료

	public void startProgram() {
		int count = 0;

		while(true) {

			int choice = printMenu();

			switch(choice) {
			case 1 : 
				displayMsg("1. 회원 정보 등록");
				insertMember();
				break;
			case 2 :
				displayMsg("2. 회원 정보 수정");
				break;
			case 3 : 
				displayMsg("3. 회원 정보 삭제");
				break;
			case 4 : 
				displayMsg("4. 회원 정보 출력(이름)");
				printMember();
				break;
			case 5 : 
				displayMsg("5. 회원 전체 정보 출력");
				printAllMembers();
				break;
			case 6 : 
				displayMsg("프로그램 종료");
				count++;
				break;
			default :
				//"잘못된 숫자가 입력됨. 1~6 사이의 숫자 입력 가능"
				break;
			}
			
			if (count == 1) {
				break;
			}
			
//			if (choice == 6) {
//				break;
//			}
			
		}
	}
	
	public int printMenu() {
		displayMsg(" ===== 회원 관리 프로그램 =====");
		displayMsg("1. 회원 정보 등록");
		displayMsg("2. 회원 정보 수정");
		displayMsg("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		
		
		int choice = sc.nextInt();
		return choice;

	}
	
	public void insertMember() {
//		private String memberId;	// 회원 아이디
//		private String memberPw;	// 회원 비밀번호
//		private String memberName;	// 회원 이름
//		private String email;		// 이메일
//		private String phone;		// 연락처
		
		Member member = new Member();
		
		System.out.print("회원 아이디 :");
		String memberId = sc.next();
		
		System.out.print("비밀번호");
		String memberPw = sc.next();
		
		System.out.print("이름");
		String memberName = sc.next();
		
		System.out.print("메일");
		String email = sc.next();
		
		System.out.print("정보");
		String phone = sc.next();
		
		
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phone);
		
		mDAO.insertMember(member);
	}
	
	public void printMember() {
		
		List<Member> members = mDAO.findAllMember();
		
		System.out.println("조회할 회원 아이디를 입려해 주세요 : ");
		String findId = sc.next();
		
		boolean flag = false;
		
		for (int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			
			if(findId.equals(member.getMemberId())) {
				displayMsg("회원 아이디 : " + members.get(i).getMemberId());
				displayMsg("회원 아이디 : " + members.get(i).getMemberPw());
				displayMsg("회원 아이디 : " + members.get(i).getMemberName());
				displayMsg("회원 아이디 : " + members.get(i).getEmail());
				displayMsg("회원 아이디 : " + members.get(i).getPhone());
				displayMsg("------------------------");
				
				flag = true;
				break;
				
			} 
			
		}
		
		if(flag == false) {
			displayMsg("회원 아이디가 존재하지 않습니다.");
		}
	}	
	

	
	
	// 5.회원 전체 정보 출력
	public void printAllMembers() {
		
		List<Member> members = mDAO.findAllMember();
		
		for(int i = 0; i<members.size(); i++) {
			Member member = members.get(i);
			
			displayMsg("회원 아이디 : " + members.get(i).getMemberId());
			displayMsg("회원 아이디 : " + members.get(i).getMemberPw());
			displayMsg("회원 아이디 : " + members.get(i).getMemberName());
			displayMsg("회원 아이디 : " + members.get(i).getEmail());
			displayMsg("회원 아이디 : " + members.get(i).getPhone());
			displayMsg("------------------------");
			
		}
		
		
	}
	
	//메제시 출력용
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
}
