package com.example.designpattern.observer;

import java.util.ArrayList;

public class Cell {
	private String contents;
	
	private ArrayList<CellListener> cellListeners;
	
	public Cell() {
		cellListeners = new ArrayList<CellListener>();
	}
	
	public void addListener(CellListener listener) {
		cellListeners.add(listener);
	}
	
	public void notifyAllListeners() {
		for (CellListener listener : cellListeners) {
			listener.update(contents);
		}
	}
}
