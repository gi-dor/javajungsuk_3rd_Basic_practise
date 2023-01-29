
public class PrinftEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.println(10/3);  //   정수/정수  = 정수만 표현
System.out.println(10.0/3);
*/
		
/*	System.out.printf("age :%d  year :%d\n" , 14 , 2022);	
	System.out.printf("age :%d  year :%d" , 15 , 2022);	
	System.out.printf("age :%d  year :%d%n" , 16 , 2022);	
	*/	
		
		//  %n 개행문자 줄띄어쓰기
		
		// 정수를 10진수 8진수 16진수로 출력하기
	/*	System.out.printf("%d%n" , 15);  //10진수 
		System.out.printf("%o%n" , 15);    // 8진수
		System.out.printf("%x%n" , 15);      // 16진수
		*/
		
		
// 2진수로
//System.out.printf("%s%n", Integer.toBinaryString(15));

//  Integer.toBinaryString  15를 2진수로 표현

	/*	
		// 접두사 붙여서 8진수 16진수 강조 표현하기 
		System.out.printf ( "%#o%n" , 15);  // 017
		System.out.printf ( "%#x%n" , 15 );  // 0xf
		System.out.printf ( "%#X%n" , 15);  // 0XF   
		*/
		

//float f =123.456789f;
//System.out.printf("%f%n", f);   // float는 정밀도가 7자리 

//double f = 123.456789;
//System.out.printf("%f%n", f);  // 실수
//System.out.printf("%e%n", f);  // 지수
//System.out.printf("%g%n", f);  // 간략하게
//
//
/*System.out.printf("[%5d]%n" ,10);
System.out.printf("[%-5d]%n" ,10);
System.out.printf("[%05d]%n" ,10);
	System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%d]%n", 10);
*/
		/*
		double d = 1.23456789;
		
		System.out.printf("%14.10f%n", d);
		System.out.printf("%14.6f%n", d);
		System.out.printf("%.6f%n", d);
		*/
		
		System.out.printf("[%s]%n" , "www.codechobo.com");
		System.out.printf("[%20s]%n" , "www.codechobo.com");
		System.out.printf("[%-20s]%n" , "www.codechobo.com");
		System.out.printf("[%.10s]%n" , "www.codechobo.com");

	}

}
