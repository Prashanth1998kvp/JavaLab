package com;

public class Marks {
	int test1,test2,test3,total;

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}

	public int getTotal() {
		total=test1+test2+test3/3;
		return total;
	}

	@Override
	public String toString() {
		return "Marks [test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", total=" + total + "]";
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
