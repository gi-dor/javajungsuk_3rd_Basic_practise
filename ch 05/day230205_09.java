import java.util.Arrays;
// ctrl + shift + o  �ڵ����� import �� �߰�

public class day230205_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� ����
		// �迭�̸�.length -�迭�� ���� (int�� ���)
		
		// int [] arr = new int[5];  ���̰� 5�� int�迭
		// int tmp = arr.length; 
		// arr.length�� ���� 5�̰� tmp�� 5�� ����ȴ�
		
		// �迭�� �ѹ� �����ϸ� (���� �ϴµ���) �� ���̸� �ٲܼ� ����.
		
		
		
//		int[] score = new int[6];
//		
//		for(int i = 0; i <6; i++) {
//			System.out.println(score[i]);
//			// �迭�� ��� ��� ���
//		}
//		 
//		for( int i =0; i < score.length ; i++ ) {
//			System.out.println(score[i]);
//		}
//		
		int[] arr = new int[7]; // ���̰� 5�� int �迭 arr ����
		// index���� 0~7-1
		
		int[] arr2 = new int [10]; // ���̰� 10�� int �迭 arr2
		// index ���� 0 ~ 10-1
		
		System.out.println("arr.length = "+ arr.length);
		System.out.println("arr2.length = "+ arr2.length);
		
		System.out.println();
		
		for ( int i =0; i<7; i++) {
			System.out.println("arr["+i+"]= " +arr[i]);
		}
		
		System.out.println();
		for ( int i =0; i < arr2.length; i++) {
			System.out.println("arr[" +i+ "] = "+ arr2[i]);
		}
		System.out.println();
		
		
		
		// �迭�� �ʱ�ȭ
		// �迭�� �� ��ҿ� ó������ ���� �����ϴ� ��
		int [] score = new int[5];  // index����:0 ~ 5-1 
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		// int score = new int [5];
		for( int i = 0; i <score.length; i++) {
			score[i] = i*10 +50;
		}
		
//
		int [] score1 = new int[] { 50, 60,70,80,90};
		int [] score2 = {50,60,70,80,90}; //  �ַ� ���
		
		System.out.println("score1 = "+score1[2]);
		
		
		// �迭�� ���
		
		
		int[] iArr1 = { 100,90,80,70,60}; // �迭���� 5��
		// iArr.length = 5;
		
		System.out.println("iArr = "+iArr1);  
		//[I@2a139a55 ���ڿ��� ��µ�
		// �迭 �̸������δ� ����� �ȵ�
		
		
		char[] chArr = {'a','b','c','d'};
		System.out.println("chArr = "+chArr);
		// char �迭��쿡�� �̸������� ����̵�
		
						// 0 ~ 5-1(0,1,2,3,4)
//		for ( int i =0; i <iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
		
		
		System.out.println("Arrays(iArr1) = "+Arrays.toString(iArr1));
											// �迭�� ������ ���ڿ���
		
		
	int [] iArr2= {100,90,80,70,60,50}; // ���̰� 6�� int �迭
	
		//	System.out.println(iArr2);  [I@6d06d69c ��µ�
	
 	
		for ( int i = 0; i < iArr2.length;i++) {
			System.out.println("iArr2 = "+iArr2[i]);
		}
		
		System.out.println("Arrays(iArr2) = "+Arrays.toString(iArr2));
	
	}

}
