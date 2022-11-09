package com.mila.onetoone_uuid;

import java.util.HashMap;
//import java.util.Map;
import java.util.UUID;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<UUID,Student> studentMap = new HashMap<>();
		// Map<UUID,Student> studentMap2 = new HashMap<>(); // polimorfisme de interficies
		
		Address ad1 = new Address(100,"Carrer Prim",
				"Badalona", "BCN");
		
		Student st1 = new Student(1,"Pepe", "Soto","Java", ad1 );
		
		studentMap.put(st1.getUuid(), st1);
		
		Student stSearched = studentMap.get(st1.getUuid());
		
		System.out.println(stSearched);
		System.out.println("El uuid es " + st1.getUuid());
		
	}

}
