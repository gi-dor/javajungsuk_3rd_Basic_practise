package _ch04;
import java.util.Scanner;
public class Ex4_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int score = 0;
		char grade = ' ';
		
	System.out.print("������ �Է��ϼ��� ��");
	Scanner scanner = new Scanner(System.in);
	score = scanner.nextInt();
	
		if (score >= 90) { 
			grade = 'A';
		}else if (score >= 80) {     	 // 80 <= score && 90 < score
			grade = 'B';
		}else if (score >= 70) {     	// 70 <= score && 80 <score
			grade = 'C';
		}else {	
			grade = 'D';
		}
			System.out.println("����� ������ " + grade + "�Դϴ�");
		
	}

}
