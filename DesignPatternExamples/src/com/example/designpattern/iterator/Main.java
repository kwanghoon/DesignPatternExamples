package com.example.designpattern.iterator;

public class Main {
    public static void main(String[] args) {

        // Iterator 패턴을 직접 사용하면
		ThreeIntegers c = new ThreeIntegers(5,1,7);
		Iterator<Integer> iter = c.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Exercise1: 반복 패턴을 사용하지 않고
		//            ThreeIntegers 객체의 3개 정수를 꺼내 출력하는 프로그램을 작성하시오. 

        // Exercise2: Java의 Iterator와 Iterable을 구현하도록 수정하면
        //           Java의 for each 문을 사용할 수 있다.
        //           com.example.designpattern.iterator.Itearble과 Itearator 인터페이스를 삭제하고
        //           java.lang.Itearble과 Iteartor 인터페이스를 사용하도록 수정하고,
        //           아래의 프로그램을 실행해보시오.
        
        // c = new ThreeIntegers();

		// for (Integer i : c) {
		//      System.out.println( i );
		// }

      }
}
