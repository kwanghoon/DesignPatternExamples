package com.example.designpattern.iterator;

// java.lang.Iterator을 다시 정의함

public interface Iterator<E> {
	boolean hasNext();
	E next();
	// void remove();
}
