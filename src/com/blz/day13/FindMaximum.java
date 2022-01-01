package com.blz.day13;

public class FindMaximum {
	public static void main(String[] args) {
		System.out.println("Welcome to Find Maximum Problem using Generics");
		Float p = 20.85f, q = 90.55f, r = 80.98f;
		testMaximum(p, q, r);
	}

	private static void testMaximum(Float p, Float q, Float r) {
		Float max = p;
		if (q.compareTo(p) > 0) {
			max = q;
		}
		if (r.compareTo(max) > 0) {
			max = r;
		}
		System.out.println("Maximum Number is: " + max);

	}

}
