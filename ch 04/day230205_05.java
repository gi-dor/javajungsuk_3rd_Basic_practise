import java.util.Scanner;

public class day230205_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue문
				// 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
				// 전체 반복중에서 특정 조건시 반복을 건너뛸 때 유용함
				
				System.out.println("-----1번-----");
				 for ( int i = 0; i <= 10; i++) {
					 if ( i%3 == 0) // 3의 배수
						 continue;
					 // 조건식이 true가 되어 continue문으로 수행되면
					 // 블럭의 끝으로 이동함
					 System.out.println(i);
				 }
				 System.out.println("-----2번-----");
				 for ( int j =0; j <=15 ; j++) {
					 if ( j%2==0)
						 continue;
					 System.out.println(j);
				 }
	}

}
