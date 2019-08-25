package edu.gs.testing.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Area {
	private String pincode;
	private int radius;
	private String name;

	public Area(String pincode, int radius, String name) {
		this.pincode = pincode;
		this.radius = radius;
		this.name = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Area [pincode=" + pincode + ", radius=" + radius + ", name=" + name + "]";
	}

}

public class HashCollections {

	public static void main(String[] args) {

		Area area1 = new Area("110063", 3434, "Paschim vihar");
		Area area2 = new Area("768778", 124, "Punjabi bagh ");

		Area area3 = new Area("120099", 544, "New friends");

		Area area4 = new Area("133478", 6767, "Haus Khaz");

		Area area5 = new Area("989999", 788, "Champa gali");

		Map<String, Object> areaMap = new HashMap<String, Object>(5);

		areaMap.put("110063", area1);
		areaMap.put("768778", area2);
		areaMap.put("120099", area3);
		areaMap.put("133478", area4);
		areaMap.put("989999", area5);

		System.out.println(areaMap);

		System.out.println("110063".hashCode());

		System.out.println("key 110063 old value");
		System.out.println(areaMap.get("110063"));

		areaMap.put("110063", area4);

		System.out.println("key 110063 new  value");

		System.out.println(areaMap.get("110063"));

		System.out.println("java 7 for  each");

		Set<Map.Entry<String, Object>> nodes = areaMap.entrySet();
		// for (Map.Entry<String, Object> node : nodes) {
		// System.out.println("key is " + node.getKey());
		// System.out.println("value is " + node.getValue());
		//
		// }

		// nodes.forEach(obj->{
		// System.out.println("key is "+obj.getKey());
		// });

		areaMap.forEach((key, val) -> {
			System.out.println("key is " + key);
		});
		
		areaMap.entrySet().stream().map((ob)->{Area area= (Area)ob.getValue();
			area.getName();
		}).
	}

}
