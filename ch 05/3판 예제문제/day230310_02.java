package day28;

public class day230310_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
		System.out.println("예제 5 - 18");
		
		int[][] score = { 
				{ 100 , 100, 100},
				{ 20 , 20 ,20 },
				{ 30 , 30 , 30 },
				{ 40 , 40 , 40 }
				};
		int sum = 0; 
		
		for ( int i = 0; i < score.length; i++) {
			for(int j = 0 ; j< score[i].length; j++) {
				System.out.printf("score [%d][%d] = %d%n", i , j, score[i][j]);
				sum = sum + score[i][j];
			}				
		}
		System.out.println("sum = "+sum);
		
		
	}

}
