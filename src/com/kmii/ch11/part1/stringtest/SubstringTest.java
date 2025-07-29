package com.kmii.ch11.part1.stringtest;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String addr = "서울특별시 종로구 숭인동 111번지 306호 2층";
		
		String firstAddrStr = addr.substring(6, 9);   // 시작하는 글자는 포함인데 끝나는글자는 출력할때 포함x, 원하는 자리보다 +1
		System.out.println(firstAddrStr);
		 String secondAddrStr = addr.substring(14);  //시작인덱스부터 끝까지 추출
		 System.out.println(secondAddrStr);

	}

}
