import java.util.Scanner;;


public class day230205_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// do while
				// 블럭 { } 을 최소한 한번 이상 반복 - 사용자 입력을 받을때 주로 이용함
				// while 문과  기본적인 구조는 같으나
				// 조건식과 블럭 { } 의 순서를 바꿔 놓은 것이다
				
				
				
				// do { 
				 
				
				// } while(조건식);
				
				// 잘사용되지는 않지는 반복적으로 사용자의 입력을 받아서 처리할때 쓰인다.
				
				
				
				int input = 0;
				int answer = 0;
				
				answer= (int)(Math.random()*100)+1;
				// 1 ~ 100 사이의 임의의 수를 지정
				
				Scanner scanner = new Scanner(System.in);
				do {
					System.out.print("1과 100 사이의 정수를 입력하세요. >>");
					input = scanner.nextInt();
					
					if (input > answer) {
						System.out.println("더 작은 수로 입력해주세요 ");
					} else if (input < answer ) {
						System.out.println("더 큰 수로 입력해주세요 ");
					}
				} while (input != answer);
			System.out.println("정답 입니다");

	}

}
