
public class day230205_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름 붙은 반복문
		// 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어 날수 있다
		

		asd1 : for ( int i =2; i <= 9; i++) {
			for(int j =1; j <=9; j++) {
				if (j==5)
					break asd1;
				System.out.println(i+"*"+j+"=" +i*j);
				
			}
			System.out.println();
		}
		
	}

}
