package _ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// index의범위 : 0 ~ 9 
		int[] arr = new int[9]; // 길이가 5인 int배열 arr생성
		arr[5] = 17;
		
		System.out.println("arr.length = " +arr.length);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+ arr[i]);
		}
		
		
		
	}
		

}
