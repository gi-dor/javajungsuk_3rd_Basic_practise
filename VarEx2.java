import java.util.zip.ZipEntry;

public class VarEx2 {

	public static void main(String[] args) {
		
        // 6+3 의 결과 출력하기
	
		
	int x = 1 ,  y = 2  , z = 3; 
	int  tmp;  
	
	//문제 1.  x = y , y = z  z = x
    
	
	tmp = x;  // x 값을 tmp 저장  
	
	x = y;    // x = 2
	y = z; // 
	z = tmp;
	
	System.out.println("x = "+x);
	System.out.println("y = "+y);
	System.out.println("z = "+z);
		
	}

}
