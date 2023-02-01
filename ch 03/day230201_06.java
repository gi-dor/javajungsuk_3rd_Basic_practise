package day03;

public class day230201_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// 사과를 담는데 필요한 바구니의 수를 구하는 코드
		// 만약 사과의 수가 123개이고 
		// 하나의 바구니에 10개의 사과를 담을수 있다면
		// 13개의 바구니가 필요할것이다
		
		int Apples = 123;
		int bucket = 10;
		int numbucket = (Apples / bucket )+1;
				// numbucket = (Apples / bucket )+1; 
				
				System.out.println("필요한 바구니의 수 "+numbucket);
		
				// 사과 1231개
				// 1개의 바구니는 70개의 사과를 담을수 있다
				// 총 몇개의 바구니가 필요할까?
				
		
			int apple1 = 1231;
			int bucket1 = 70;
			int numbucket1 = (apple1 / bucket1)+1;
			System.out.println("필요한 바구니의 수 "+numbucket1);
		
		
	}

}
