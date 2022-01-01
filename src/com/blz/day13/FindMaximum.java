package com.blz.day13;

public class FindMaximum {

	public static void main(String[] args) {
		System.out.println("Welcome to Generics Program");

		System.out.println("Welcome to Generic Program.");
		Integer a = 20, b = 42, c = 65;
		Float x = 2.3f, y = 7.8f, z = 6.7f;
		String l = "Apple", m = "Banana", n = "Orange";

		FindMaximum.getMaximum(a, b, c);
		FindMaximum.getMaximum(x, y, z);
		FindMaximum.getMaximum(l, m, n);
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
