

public class day230205_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 번");
			int i = 5;
			while ( i!=0) {
				i--;
				System.out.println(i +" - I can do it");
					
					
			}
			System.out.println("2 번");
			i =5;
		while ( i!=0) {
			System.out.println(i +" l I can do it 2");
			i--;
		}
		
		// 1부터 몇까지 더해야 100을 넘지 않을까?
		
		int sum = 0;
		int x = 0;
		
		while (sum <=100) {
			System.out.printf("%d - %d%n ",x ,sum);
			sum =sum+(++x);
		// sum += ++x;
		}
	}

}
