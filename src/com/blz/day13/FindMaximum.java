package com.blz.day13;

public class FindMaximum<T extends Comparable> {
	T var1, var2, var3;

	public FindMaximum(T var1, T var2, T var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Generic Program.");

		Integer a = 21, b = 42, c = 67;
		Float x = 3.5f, y = 9.8f, z = 5.8f;
		String l = "Apple", m = "Banana", n = "Orange";

		new FindMaximum<>(a, b, c).max();
		new FindMaximum<>(x, y, z).max();
		new FindMaximum<>(l, m, n).max();
	}

	private void max() {
		FindMaximum.getMaximum(var1, var2, var3);

	}

	private static <T extends Comparable> void getMaximum(T a, T b, T c) {

		T max = a;
		if (b.compareTo(a) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}

		System.out.println("Maximum ::" + max);

	}
}
