// 상속

// 1.기존의 클래스를 재사용해서 새로운 클래스를 작성하는것
// 2.상속 해주는 클래스를 '조상 클래스' 상속받는 클래스를 '자손 클래스' 
// 3.자손 클래스는 조상클래스의 모든 멤버를 상속받는다(생성자, 초기화 블럭은 제외)
// 4.자손 클래스의 멤버개수는 조상 클래스로부터 항상 같거나 많다

// 새로 작성하려는 클래스 이름 뒤에 상속 받고자 하는 클래스의 이름을 extends와 함꼐 쓰면된다
// class Parent{ }
// class Child extends Parent {  }

// 예제 기초편 7-1

package day15;
class Tv {
	boolean power;	// 전원 상태 on / off
	int channel;	// 채널
	
	void power( ) { power = !power; }
	void channelUp( ) { ++channel; }
	void channelDown( ) {
		-- channel;
	}
	
}

class SmartTv extends Tv{		//Smart tv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;			// 캡션상태 on / off
	void displayCaption(String text) {
		if (caption) { 			// 캡션 상태가 on (true)일 때 text를 보여준다
			System.out.println(text);
		}
	}
}


public class day230220_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	SmartTv stv = new SmartTv();
	stv.channel = 10;
	stv.channelUp();
	stv.channelUp();
	System.out.println(stv.channel);
	stv.displayCaption("Hello,world");
	stv.caption = true;  // 캡션 (자막) 기능을 켠다
	stv.displayCaption("Hello,world");
	
	
	}

}
