package com.kmii.ch11.part1;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member1 = new Member("tiger");
		Member member2 = new Member("tiger");
		Member member3 = new Member("monkey");
		
		if (member1.equals(member2)) {  
			System.out.println("두 멤버의 id는 동일합니다!");
		} else {
			System.out.println("두 멤버의 id는 동일하지 않습니다!");
		}
		
		if (member1.equals(member3)) {
			System.out.println("두 멤버의 id는 동일합니다!");
		} else {
			System.out.println("두 멤버의 id는 동일하지 않습니다!");
		}
		
		
		System.out.println("------------------------------");
		
		System.out.println(member1.hashCode()); //메모리 번지값으로 만든 유일한값, 고유값 , 만약 동일한 경우 같은 객체를 참조하고 있다는 뜻
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		
		

	}

}
