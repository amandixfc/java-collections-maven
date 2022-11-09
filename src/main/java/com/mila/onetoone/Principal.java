package com.mila.onetoone;

import java.util.HashMap;
//import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Student> studentMap = new HashMap<>();
		// Map<Integer,Student> studentMap2 = new HashMap<>(); // polimorfisme de interficies
		
		Address ad1 = new Address(100,"Carrer Prim",
				"Badalona", "BCN");
		
		Student st1 = new Student(1,"Pepe", "Soto","Java", ad1 );
		
		studentMap.put(st1.getId(), st1);
		
		Student stSearched = studentMap.get(1);
		
		System.out.println(stSearched);
		
		
	}

}
