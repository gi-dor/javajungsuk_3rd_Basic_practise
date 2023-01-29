package _ch03;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int ▶ char▶
		int i = 65;
		char j = (char)i;
		System.out.println(j);
		
        // char ▶  int▶
 		char a = 'A';
		int b = (int)a;
		System.out.println(b);
		
		// float ▶ int
		float f = 3.14f;
		int q =  (int)f;
		// int 정수이기 때문에 소수점 버림 , 반올림 x
		System.out.println(q);
	
		// int ▶  doule
		int r = 321;
		double t = (double)r; 
	    System.out.println(t);
		
		
		// int ▶  float
		int s = 312;
		float g = (float)s;
		
		System.out.println(g);
	}

}
