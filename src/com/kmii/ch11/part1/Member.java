package com.kmii.ch11.part1;

public class Member {
	
	public String id; // 회원 아이디

	public Member() {
		super();
	}

	public Member(String id) {
		this.id = id;
	}

	
	// 객체를 인수로 받아서 그 객체와 member 클래스로 만든 객체인지 확인하여 맞으면 member객체로 다운캐스팅 후 그 안에있는 id필드를 꺼내서 
	// 본인객체가 가지고있는 id값과 비교하여 같으면 true , 아니면 false 출력하는 메소드로 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj ;  //다운 캐스팅 (obj는 부모)
			if (id.equals(member.id)) {
				return true;
			}
		}
		
		
		return false;
	}

	@Override
	public String toString() {

		return id;
	} 
	
	
	
	
	
	
	
	
	

}
