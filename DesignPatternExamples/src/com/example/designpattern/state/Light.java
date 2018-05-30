package com.example.designpattern.state;

public class Light {
	private State state;
	
	public Light() {
		state = new OFF();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public void on_button() {
		state.on_button(this);;
	}
	
	public void off_button() {
		state.off_button(this);
	}
}

// Exercise: SLEEP 상태를 추가
//      ON상태에서 on 버튼을 누르면 SLEEP 상태로 변경
//      SLEEP상태에서 on 버튼을 누르면 ON 상태로 변경
//
//      SLEEP상태에서 off 버튼을 누르면 OFF 상태로 변경 
//
// motivation.txt의 예제에서 SLEEP 상태를 추가해보고
// 상태 패턴을 적용한 예제에서도 SLEEP 상태를 추가해보시오.
// 각각 어느 부분을 변경해야하고 어느 부분을 변경하지 않아도 되는지 비교하여
//  상태 패턴의 장점을 설명하시오. 
