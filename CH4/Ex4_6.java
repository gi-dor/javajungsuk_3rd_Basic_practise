package _ch04;


public class Ex4_6{

	public static void main(String[] args) {
		// 별 찍기 
		// i = 1 2 3 4 5   5번 반복
		System.out.println("문제 1번");
		for (int i =1; i <= 10; i++) {
			System.out.println("**********");
		}
		System.out.println();
		
		System.out.println("문제 2번");
		for (int i =1; i<=6; i++) {
			for(int j =1; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
	
		System.out.println("문제 3번");
		for (int i = 1; i <= 7; i++) {   // 줄 갯수
			//	System.out.println("*********");
			for (int j = 1; j <=i; j++) {
				System.out.print("*");   // 옆으로 별 몇개 찍을지
			}
			System.out.println();  // 줄바꿈
		}
		
		for (int i = 7; i >= 1; i-- ) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("문제 4번");
		for (int i =1; i<=10 ; i++) {
			for (int j = 1; j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
   }
}

