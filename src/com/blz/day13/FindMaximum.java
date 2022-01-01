package com.blz.day13;

public class FindMaximum {
	 public static void main(String[] args) {
	        System.out.println("Welcome to Find Maximum Problem using Generics");
	        Integer a = 20, b = 50, c =80;
	        testMaximum (a,b,c);
	    }

	    private static void testMaximum(Integer a, Integer b, Integer c) {
	        Integer max = a;
	        if(b.compareTo(a)>0){
	            max = b;
	        }
	        if(c.compareTo(max)>0){
	            max = c;
	        }
	        System.out.println("Maximum Number is::"+max);
	    }


	}