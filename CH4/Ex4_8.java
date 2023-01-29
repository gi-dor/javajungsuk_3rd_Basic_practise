package _ch04;

import java.util.*;
public class Ex4_8{

	public static void main(String[] args) {
		
		int input = 0;   int answer = 0;
			// 1부터 100사이의 정수 입력해서 정답 맞추기
		answer = (int)(Math.random() * 100) +1;
		Scanner scanner = new Scanner(System.in);
		

		
		do {
			System.out.println("1 ~ 100 사이의 정수를 입력하세요  ▶▶ ");
			input = scanner.nextInt();
			
			if (input > answer) { 
				System.out.println("더 작은 수로 다시 입력하세요");
				System.out.println();
				
		}else if (input < answer) {
			System.out.println("더 큰 수로 다시 입력하세요");
			System.out.println();
		}
		}while (input != answer);
	System.out.println("정 답 ");
			
	}
}


