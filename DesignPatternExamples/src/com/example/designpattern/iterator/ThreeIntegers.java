package com.example.designpattern.iterator;

public class ThreeIntegers implements Iterable<Integer> {
	private Integer x, y, z;

	public ThreeIntegers(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Integer first() { return x; }

	public Integer second() { return y; }
	
	public Integer third() { return z; }
	
	@Override
	public Iterator<Integer> iterator() {
		return new ThreeIntegersIterator(this);
	}

}
