package _ch05;


public class Ex5_6 {

	public static void main(String[] args) {
		
	// 배열 최대값 , 최소값 구하기
		int[] score = { 79 , 87, 99, 101 ,61};
		
		int max = score[0];   // 배열 첫번째 요소에 최대값, 최소값 초기화
		int min = score [0];
		
		for (int i = 1; i < score.length; i++) { //배열 2번째 요소부터 읽기위해 1로 초기화
			if(score[i] > max) {
				max = score [i];
			}else if (score [i] < min) {
				min = score[i];
			}
			
		}   // for문 마지막 괄호
       	System.out.println("최대값 : "+max);
       	System.out.println("최소값 : "+min);
	}
		

}
