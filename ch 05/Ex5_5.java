package _ch05;


public class Ex5_5 {

	public static void main(String[] args) {
			// ¹è¿­ ÃÑÇÕ,Æò±Õ ±¸ÇÏ±â		
	int sum = 0;
	float average = 0f;
	
	int [] score = { 100, 87 ,100 ,65 ,100} ; // ÃÑ 452
	
	for (int i = 0; i< score.length; i++) {
		sum = sum + score[i];
	//	sum += score[i];
	}
		average = sum / (float)score.length;  // °á°ú °ªÀ» floatÅ¸ÀÔÀ¸·Î ¹Þ±âÀ§ÇØ
		
		System.out.println(" ÃÑ ÇÕ : " +sum);
		System.out.println(" Æò±Õ : "+average);
		
		// 452 / 5 = 90.4
		// 452 / (float)5 = 478/5.0f = 452.0f/5.0f = 90.4f
	
	}
		

}
