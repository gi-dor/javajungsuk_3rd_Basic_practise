
public class day230205_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // �迭
		 // ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�°�
		

		int [] score = new int [5];
		// int �� 5���� �����Ҽ� �ִ� �迭
		
		
		
		// �迭�� ����� ����
		// �迭�� ���� - �迭�� �ٷ�� ���� '��������' �� ����
		
		// 1. Ÿ�� [ ] �����̸�;
		int[] score1;
		String [] name;
		
		// 2. Ÿ�� �����̸� [ ];
		int score2 [];
		String name1 [];
	
		int[] score3; // intŸ���� �迩�� �ٷ������ �������� score3����
		score3 = new int[5];// int Ÿ���� �� 5���� ���� �Ҽ��ִ� �迭����
	// score[0] , score[1] ,score[2], score[3] ,score[4]
		// index�� ���� 0 ~ 4  , 5��
		
		// �迭�� �ε���
		// �迭�� �ε��� - �� ��ҿ�(�������) �ڵ����� �ٴ� ��ȣ
		// " index�� ������ 0 ���� '�迭����-1'����
		// int [] score = new int[5];
		//  ���̰� 5�� int�迭
		// 0 ~ 5-1 
		// ������� �ϳ��� �迭�� ��Ҷ�� �Ѵ�
		
		// score [3] = 100;
		// score[0] ,score[1],score[2],score[3],score[4]
		// �迭�� 4��° ��ҿ� 100�� �����Ѵ�
		
		// int value = score[3];
		// �迭 score�� 4��° ����� ���� �о 'value'�� ����
		// int value = 100
		
//		int[] score ;		// 1. �迭 score ���� (��������)
//		score = new int[5]; // 2. �迭�� ���� (int�������x5)
		
		int[] score4 = new int[5];
		score4 [3] =100;
		// score[0] score[1] score[2] score[3] score[4]
		System.out.println(score4[3]);

		System.out.println("score4 [0] "+ score4[0]);
		System.out.println("score4 [1] "+ score4[1]);
		System.out.println("score4 [2] "+ score4[2]);
		System.out.println("score4 [3] "+ score4[3]);
		System.out.println("score4 [4] "+ score4[4]);
		
		int value = score4 [3];
		System.out.println("value = "+value);
		
	}

}
