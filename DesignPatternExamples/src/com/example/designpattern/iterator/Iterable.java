package com.example.designpattern.iterator;

// java.lang.Iterable<E>를 다시 정의함

public interface Iterable<E> {
	Iterator<E> iterator();
}
