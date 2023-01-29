package _ch03;

public class Ex3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 1_000_000;  // 1백만
      int b = 2_000_000;  // 2백만
      
      // long c = a * b ;   // a * b = 2,000,000,000,000 인데 왜  -1454759936 ??
       
       // long 10의 12제곱
       // int  10의 9제곱
       
       
       // 1. a 혹은  b를 long 으로 변환
       // 2. a  b 둘다 long 으로 변환
      
        long c = (long)a * (long)b;
              
       System.out.println(c);
	}

}
