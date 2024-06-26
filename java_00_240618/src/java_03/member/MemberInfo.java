package java_03.member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		member.setMemberId("dri1356");
		member.setMemberName("최예지");
		member.setMemberEmail("dri1356@naver.com");
		member.setMemberGender("여성");
		member.setMemberPhone("010-00-000");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberPhone());
		System.out.println(member.getMemberGender());
		

		member.setMemberId(null);
		System.out.println(member.getMemberId());

		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자

		Member mem1 = new Member("id_1", "이정재");
		Member mem2 = new Member("id_2", "박혜수");
		Member mem3 = new Member("id_3", "오영수");
		Member mem4 = new Member("id_4", "정호연");
		Member mem5 = new Member("id_5", "허성태");
		
		System.out.println("[1]" +  mem1.getMemberId() + "::" + mem1.getMemberName() );
		System.out.println("[2]" +  mem2.getMemberId() + "::" + mem2.getMemberName() );
		System.out.println("[3]" +  mem3.getMemberId() + "::" + mem3.getMemberName() );
		System.out.println("[4]" +  mem4.getMemberId() + "::" + mem4.getMemberName() );
		System.out.println("[5]" +  mem5.getMemberId() + "::" + mem5.getMemberName() );
		
		
		

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}