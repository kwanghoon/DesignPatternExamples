package com.example.designpattern.iterator;

public class ThreeIntegersIterator implements Iterator<Integer> {
	private ThreeIntegers threeIntegers;
	private int index;
	
	
	public ThreeIntegersIterator(ThreeIntegers threeIntegers) {
		this.threeIntegers = threeIntegers;
		index = 1;
	}

	@Override
	public boolean hasNext() {
		if (index == 1 || index == 2 || index == 3)
			return true;
		else
			return false;
	}

	@Override
	public Integer next() {
		if (index == 1) {
			index++;
			return threeIntegers.first();
		}
		else if (index == 2) {
			index++;
			return threeIntegers.second();
		}
		else if (index == 3) {
			index++;
			return threeIntegers.third();
		}
		else {
			return null;
		}
	}

}
