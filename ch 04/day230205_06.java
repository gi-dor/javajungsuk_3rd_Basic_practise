import java.util.Scanner;

public class day230205_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break문과 continue문
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1. square");
			System.out.println(" 2. square root");
			System.out.println(" 3. log");
			System.out.print("원하는 메뉴 1~3 을 선택하세요 . 종료(0)");
			
			menu = scanner.nextInt();
			// 화면에서 입력받은 내용을 menu로
			
			if ( menu ==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if ( !(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘못 입력 하셨습니다. 종료(0)");
				continue; // 입력을 계속 받아야하니 continue 사용
			}
			System.out.println("선택하신 메뉴는" + menu +"번 입니다");
		}
	}

}
