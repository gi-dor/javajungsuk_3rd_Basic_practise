import java.util.Scanner;
public class ScanfEx1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
//	
//	int num = scanner.nextInt();
//	int num2 = scanner.nextInt();
//	float num3 = scanner.nextFloat();
//	
//	System.out.println(num);
//	System.out.println(num2);
//	System.out.println(num3);

    String input = scanner.nextLine(); // 라인 단위로 입력받기
    
    int num = Integer.parseInt(input);
   
    
    System.out.println(num);
   
    
     
	}

}
