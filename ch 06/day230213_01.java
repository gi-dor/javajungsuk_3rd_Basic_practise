package note_01;



public class day230213_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 3�� ���� 6-6 
		// �޼��� - ȣ�⽺�� ����
		
		Mymath m = new Mymath();
		
		long result1 = m.add(5, 2);
		long result2 = m.sub(10, 7);
		float result3 = m.multi(2, 6);
		double result4 = m.divide(10, 4);
		float result5 = m.multi1(10, 4);
		//   
		
		
		System.out.println("add(5,2) = "+result1);
		System.out.println("sub(10,7) = "+result2);
		System.out.println("multi(2,6) = "+result3);
		System.out.println("divide(10,4) = "+result4);
		System.out.println("divide(10,4) = "+result5);
		
		
	}

}
	class Mymath{
	
			long add(int x, int y) { // ��ȯŸ��(���)  �޼��� �̸� ( �Ű�����(�Է°�),�Ű�����(�Է°�))
				long result = x + y;	// result = x +y
				return result;	// result ��� ���� ��ȯ
			}
			
			long sub( int x , int y) { // �Ű������� �޼��峻�� ���� �Ȱ����� �����ϱ� ������ '�������� (lv)'�̴�
				int result = x - y;
				return result;
			}
			
			float multi ( int a , long b) { // int�� �Է°��� �޾����� �ڵ�����ȯ�� ����
				float  result = a * b;		// 2.0 6.0�� �Է¹޾���
				return result;
			}
			
			double divide ( int a , int b ) {	// ���������� int���� �Է¹޾Ƽ� 	
				double result = a / b;			// double�� �ڵ�����ȯ �Ǿ
				return result;					// 10/4 �� �ƴ� 10.0/ 4.0 = doubleŸ���� �� �� �����
			}
			
			float multi1 ( int a , long b) { // �Է¹޴� �Ű����� Ÿ���� �ٸ���
				long  result = a * b;	// result Ÿ���� long�ε� �ڵ�����ȯ��
				return result;				// long < float �̱� ������  ��ȯŸ�� float�� �ص� ����	
			}
			
			
//			int multi2 ( int a , long b) { 
//				float  result =  a * b;	
//				return result;			
//			}
			//	Type mismatch: cannot convert from float to int
			// �ذ� ��� : 
			//	1. int multi2 ( int a, long b) -> float multi2 ( int a, long b)
			//  2. float result = a* b; -> int result = a * b;
			//	3. flaot (int)result;    
			
			
			

	
}
