package edu.gs.testing.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Animal {
	private String type;
	private int age;

	public Animal(String type, int age) {
		this.type = type;
		this.age = age;
	}

	public Animal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + "]";
	}
	// @Override
	// public boolean equals(Object obj) {
	// boolean isSame = false;
	// Animal animal = (Animal) obj;
	// if (this.type.equals(animal.getType() ) && this.age == animal.getAge()) {
	// isSame = true;
	//
	// }
	// return isSame;
	// }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}

public class Collection2 {

	public static void main(String[] args) {
		
		
		List<Animal> list = new LinkedList<>();
		display(list);
		

	}

	public static  void display(List<Animal> list) {
		
		Animal dog1 = new Animal("tom", 12);
		Animal dog2 = new Animal("tom", 12);
		Animal dog3 = new Animal("jerry", 11);
		Animal dog4 = new Animal("jerry", 11);
		Animal dog5 = new Animal("abc", 19);
		Animal dog6 = new Animal("def", 17);
		Animal dog7 = new Animal("xyz", 16);

		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		list.add(dog5);
		list.add(dog6);
		list.add(dog7);

		List<String> listEvenAge = new ArrayList<String>();

		// for(Animal obj :list)
		// {
		// if(obj.getAge()%2==0)
		// {
		// listEvenAge.add(obj);
		// }
		// }

		listEvenAge = list.stream().filter(obj -> obj.getAge() % 2 == 0).map(Animal::getType)
				.collect(Collectors.toList());
		System.out.println(listEvenAge);

		/*
		 * list.remove(dog4); System.out.println(list.indexOf(dog2));
		 * System.out.println(list.contains(dog2)); if (null != list && !list.isEmpty())
		 * { System.out.println(list);
		 * 
		 * }
		 * 
		 * System.out.println("--traditional for loop--"); for (int i = 0; i <
		 * list.size(); i++) { System.out.println(list.get(i));
		 * 
		 * } System.out.println("--using iterator--"); Iterator<Animal> iterator =
		 * list.iterator();
		 * 
		 * while (iterator.hasNext()) { Animal obj = iterator.next();
		 * System.out.println(obj); // iterator.remove(); // list.remove(obj);
		 * 
		 * }
		 * 
		 * System.out.println("---using java 7 for each--");
		 * 
		 * for (Animal obj : list) { System.out.println(obj.getType());
		 * 
		 * }
		 * 
		 * System.out.println("--using java 8 for each--"); // list.forEach(obj -> // //
		 * { // System.out.println(obj); // // }); list.forEach(System.out::println);
		 * 
		 * System.out.println(list);
		 */
	}

}
