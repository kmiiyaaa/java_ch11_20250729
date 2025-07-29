package com.kmii.ch11.part1;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=10000;i++) {
			System.out.println(i);
			if(i==5000) {
				break;  //  for문 종료시킨 후 그 이후에있는 16번라인 출력함
				// System.exit(i);  // 프로그램 종료시킴 , 16번라인 출력x
			}
		}
		
		System.out.println("for문 종료 후 출력되는 문장");
		
		
		
		
		long time1 = System.nanoTime(); //현재시간을 나노단위(1/10억)로 나눠서(나노초로 변환하여) 저장
		long time_m1 = System.currentTimeMillis();  // 현재시간을 밀리초로 변환하여 저장
		System.out.println("--------------------------");
		
		long sum = 0L;  // int로 설정 시 범위 넘어서 제대로된 값 출력x 
		for(int i=1;i<=10000000;i++) {   // 10000000번 반복 for문
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println("--------------------------");
		long time2 = System.nanoTime(); //현재시간 나노초로 변환하여 저장
		long time_m2 = System.currentTimeMillis(); // 
		
		System.out.println(time2-time1); // 위 for문 실행시키는데 걸린시간 (나노초 단위)
		System.out.println(time_m2-time_m1); // 위 for문 실행시키는데 걸린시간 (밀리초 단위)
	}

}
