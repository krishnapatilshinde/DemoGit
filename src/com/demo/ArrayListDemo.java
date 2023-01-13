package com.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList arraylist=new ArrayList();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		
		arraylist.stream().forEach(x->System.out.println(x));
		
		
		
	}

}
