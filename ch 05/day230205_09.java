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
		
		// �迭�� �ѹ� �����ϸ�(���� �ϴµ���) �� ���̸� �ٲܼ� ����.
		
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
		int[] arr = new int[5]; // ���̰� 5�� int �迭 arr ����
		int[] arr2 = new int [10]; // ���̰� 10�� int �迭 arr2
		System.out.println("arr.length = "+ arr.length);
		System.out.println("arr2.length = "+ arr2.length);
		
		for ( int i =0; i<5; i++) {
			System.out.println("arr["+i+"]= " +arr[i]);
		}
		
		for ( int i =0; i < arr.length; i++) {
			System.out.println("arr[" +i+ "] = "+ arr[i]);
		}
		
		// �迭�� �ʱ�ȭ
		// �迭�� �� ��ҿ� ó������ ���� �����ϴ� ��
		int [] score = new int[5];  // 0 ~ 5-1 
		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		// int score = new int [5];
		for( int i = 0; i <score.length; i++) {
			score[i] = i*10 +50;
		}
		
		int [] score1 = new int[] { 50, 60,70,80,90};
		int [] score2 = {50,60,70,80,90}; //  �ַ� ���
		
		System.out.println(score1[2]);
		
		
		// �迭�� ���
		int[] iArr1 = { 100,90,80,70,60}; // �迭���� 5��
		// iArr.length = 5;
		System.out.println(iArr1);  
		//[I@2a139a55 ���ڿ��� ��µ�
		
//		
//		char[] chArr= {'a','b','c','d'};
//		System.out.println(chArr);
		
//		for ( int i =0; i <iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
		
		
		System.out.println(Arrays.toString(iArr1));
	
	int [] iArr2= {100,90,80,70,60,50}; // ���̰� 6�� int �迭
	
		for ( int i = 0; i < iArr2.length;i++) {
			System.out.println("iArr2 = "+iArr2[i]);
		}
		
		System.out.println(Arrays.toString(iArr2));
	
	}

}
