package com.kmii.ch11.part1.stringtest;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("좋아하는 위인을 입력하시오");
		String str = scanner.nextLine();
		
		//System.out.println(str.trim()); // trim() - 글자 앞,뒤 공백제거(스페이스바로 만든 공백)
		//str = str.trim(); // 이렇게 하지않으면 공백제거는 됐지만 공백 포함된 글자수 나옴
		//System.out.println(str.length());
		
		System.out.println(str.strip()); // 스페이스바 공백 + 특수문자로생긴 공백까지 제거 -> 이걸 쓰는게 더 좋다.
		str= str.strip();
		System.out.println(str.length());

	}

}
