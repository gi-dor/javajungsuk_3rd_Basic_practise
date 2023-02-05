import java.util.Scanner;;


public class day230205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  사용자로부터 숫자를 입력받아
		// 이 숫자의 각 자리의 합을 구하는 예제
		// ex) 12345 입력시
		// 1+2+3+4+5 = 15
		
		int num = 0;
		int sum = 0;
		System.out.print("숫자를 입력하세요. >>");

		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		// 변환없이 숫자로 바로 입력받는다
		
//		String tmp = scanner.nextLine();
		// 입력받은 내용을 tmp에 저장 
		
//		num = Integer.parseInt(tmp);
		// 입력받은 내용을 int 타입으로 변환
		
		while ( num!=0) {
			sum = sum + num%10; 
			// num 을 10으로 나눈 나머지를 sum에 더함
			// 12345%10 =5
			// 1234%10 =4
			// 123%10 =3
			// 12 %10 = 2
			// 1%10 =1
		System.out.printf("sum = %d  num = %d%n",sum ,num);
			
			num = num / 10 ;
			
		}
		
		System.out.println("각 자리수의 합 :" +sum);
	}

}
