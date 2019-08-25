package edu.gs.testing.corejava.mycollections;

public interface SimpleList {

	public Object get(int index);

	public void set(int index, Object element);

	public void add(int index, Object element);

	public Object remove(int index);

	public int size();

}
