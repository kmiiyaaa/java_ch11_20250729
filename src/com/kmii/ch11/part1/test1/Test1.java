package com.kmii.ch11.part1.test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오. 
		// indexOf 사용하면 좋다
			
				 
				String str = "abcabcabc";
				String str2 = "ab";
				int count = 0;
				int i = 0;
				
			    
				while ((i = str.indexOf(str2,i)) != -1) {    // while - 참일 경우 계속 반복
					// indexOf(str2,1) -> str2를 인덱스번호 i번째부터 찾아라
					
					count++; // 찾으면 카운트 올리고
					i = i+1 ;
				}
				
	/*			 String str = "abcabcabc";
				String str2 = "ab";
				int count = 0;
				
				for(int=0; i<str.length()-str.length();i++){
				if(str.substring(i,i+str2.length())).equals(str2) {  
				// 1회전 i=0, 0~2 -> "ab", count +1
				// 2회전 ㅑ=1 1~3 -> "bc"
				count++
				}
							
				}
	*/			
			 
			
	
				System.out.println(count);

	}

}	

//for (int i=0; i<str.length();i++) {
//	if(str.charAt(i)=='a' && str.charAt(i+1) == 'b') {
//		count++;
//	}
//}


