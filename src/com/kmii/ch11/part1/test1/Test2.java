package com.kmii.ch11.part1.test1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//korea@korea.com 이메일 주소에서 아이디와 도메인을 분리하여 출력하는 프로그램을 작성하시오.
		
		String str = "korea@korea.com";
		
		//@위치 지정하고 그 위치 기준으로 해도 좋다 
		
		int a = str.indexOf("@");
		
		String s1= str.substring(0,a);
		System.out.println("아이디 : " + s1);
		String s2=str.substring(a+1);
		System.out.println("도메인 : " + s2);
		
	}

}
