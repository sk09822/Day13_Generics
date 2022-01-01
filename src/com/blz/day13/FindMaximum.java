package com.blz.day13;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem using Generics");
		String e = "Ahmednagar", f = "Pune" , g = "Mumbai";
        testMaximum (e,f,g);
    }

    private static void testMaximum(String e, String f, String g) {
    	 String max = e;
	        if(f.compareTo(e)>0){
	            max = f;
	        }
	        if(g.compareTo(max)>0){
	            max = g;
	        }
	        System.out.println("Maximum Number is: "+max);
    	
	}

}
