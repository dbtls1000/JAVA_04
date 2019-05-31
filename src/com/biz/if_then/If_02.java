package com.biz.if_then;

public class If_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0부터 35까지 
		for( int i = 0; i<35;i++) {
			System.out.println(i);
		}
		
		for(int i=0;i<35;i++) {
			if(i%2 == 0) {
				System.out.println(i + "는 짝수입니다");
			}
				
		}
		/*
		 * 0부터 100까지의 숫자중
		 * 2로 나누어 나머지가 0인숫자(짝수)들의 합
		 */
		int intsum=0;
		for(int i =0 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				intsum +=i;
			}
		}
		System.out.println("짝수의 합:" + intsum);
		
		
		
		
	}

}
