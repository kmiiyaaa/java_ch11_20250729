package com.kmii.ch11.part1;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math안에 메서드들은 굳이 객체를 만들필요 없이 사용할 수 있게 static 선언
		Math.abs(0); // 절대값 계산
		System.out.println(Math.abs(-10));  // 절대값 계산 - 10
		System.out.println(Math.abs(-10.55));  // 10.55 , 오버로딩 해놓아서 실수도 사용가능(?)
		
		System.out.println(Math.ceil(3.14));  // 소수점 올림 / double만넣고 double로 반환
		System.out.println(Math.floor(3.94));  // 소수점 내림(버림)
		System.out.println(Math.round(3.64));  // 소수점 반올림
		
		
		System.out.println(Math.max(5, 10)); // 두 정수 중 큰값이 반환(출력)
		System.out.println(Math.max(1.1, 10.1));  // 두 실수 중 큰값이 반환
		
		System.out.println(Math.min(5, 10));  // 두 정수 중 작은값이 반환(출력)
		System.out.println(Math.min(5.5, 10.5));   // 두 실수 중 작은값이 반환
		
		System.out.println(Math.random());  // 0~1 수 중 랜덤으로 1개 반환, 0은 나오지만 1은 안나온다
		System.out.println(Math.floor(Math.random()*45+1));  // 1~ 45 중 랜덤 반환
		System.out.println((int)(Math.random()*45) + 1); // 1~ 45 중 랜덤 반환
		
		System.out.println(Math.rint(3.1));  // 반올림하는 메서드, 인수값에서 가까운 정수를 실수형으로 반환 (반올림)
		
		
	}

}
