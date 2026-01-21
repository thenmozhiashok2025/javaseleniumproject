package javaPackage;

import java.util.HashMap;  //Ctrl a -- > ctrl+shift+o it will automatically add the required package

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax to invoke hashmap
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		
		
		hm.put(1,"Jan");
		
		hm.put(2,"Feb");
		
		hm.put(3,"March");
		
		System.out.println(hm.get(1));
		
	}

}


