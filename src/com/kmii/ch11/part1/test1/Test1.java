package com.kmii.ch11.part1.test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오.

				String str = "abcabcabc";
				int count = 0;
				
				for (int i=0; i<str.length();i++) {
					if(str.charAt(i)=='a' && str.charAt(i+1) == 'b') {
						count++;
					}
				}
				
				/* 
				위에 string, int 초기화값에 추가적으로
				
			    String str2 = "ab";
				int i =0;
				
				while ((i=str.indexOf(str2,i) != -1){    // while - 참일 경우 계속 반복
				count++; // 찾으면 카운트 올리고
				i = i+1 
				}
			 
			 */
					
				System.out.println(count);

	}

}
