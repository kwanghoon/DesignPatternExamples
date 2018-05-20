package com.example.designpattern.observer;

public class Main {

	public static void main(String[] args) {
		
		// 엑셀 문서에서 다른 셀을 참조하여 함수식을 포함하는 셀을 FormularCell 클래스로
		// 다른 셀을 참조하여 그리는 막대 그래프를 BarChar 클래스로 표현함
		Cell cell1 = new Cell();
		FormularCell listener1 = new FormularCell();
		BarChart listener2 = new BarChart();
		
		cell1.addListener(listener1);
		cell1.addListener(listener2);
		
		
		
		
		// 셀의 내용이 변경되어 이 셀을 참조하는 모든 다른 셀들과 모든 그래프들에게 알림. 
		
		cell1.notifyAllListeners();
		
		// Cell 클래스는 Listener 인터페이스만 알뿐
		// FormularCell 클래스나 BarChar 클래스를 직접 알지 못함.
		// 그럼에도 불구하고 Cell의 내용이 바뀌면
		// 두 클래스에 알려줄 수 있는 구조임. 
	}

}
