package edu.gs.testing.corejava.collections;


import java.util.ArrayList;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("amola");
		list.add("monika");
		list.add("gurleen");
		System.out.println(list);
		list.remove(new String("monika"));
		System.out.println(list);
		
		
		String name= (String) list.get(1);
		
	}

}
