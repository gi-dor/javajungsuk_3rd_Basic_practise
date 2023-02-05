import java.util.Scanner;


public class day230205_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// 자신이 포함된 하나의 반복문을 벗어난다
		
		// 숫자를 1부터 계쏙 더하며  몇까지 더해야 100이 넘는가 ?
		
		// i의 값을 1부터 1씩 증가시키며 더하면서 sum에 저장
		// sum의 값이 100 을 넘으면 break문이 수행되어
		// 반복문 밖으로 간다
		
		int sum = 0;
		int i = 0;
		
		while (true) {  // 무한 반복문  for(;;), while문은 true 생략불가
			if ( sum > 100)
				break;  // sum > 100 이 true이면 break실행됨
			++i;
			sum = sum +i ;
		}
		
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
		
	}

}
