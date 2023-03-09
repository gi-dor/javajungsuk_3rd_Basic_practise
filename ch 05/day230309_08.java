package day27;

public class day230309_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("예제 5 - 10 정렬하기 ");
		int[] numArr = new int[10];
		
		for ( int i = 0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));
		}
		System.out.println();
		
		for ( int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; 
			
			for ( int j = 0; j<numArr.length-1-i; j++) {
				if( numArr[j] > numArr[j+1] ) {
					int temp = numArr[j];
					numArr[j]= numArr[j+1];
					numArr[j+1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;
			
			for ( int k =0; k < numArr.length;k++)
				System.out.print(numArr[k]);
			System.out.println();
		}
	}

}
