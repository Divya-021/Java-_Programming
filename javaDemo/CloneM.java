package com.kiet.javaDemo;
class Student implements Cloneable
{
	String name;
	int id;
	Student()
	{
		System.out.println("default");
	}
	Student(String s, int a)
	{
		name=s;
		id=a;
		System.out.println("name: "+name+" id: "+id);

			}
	public Object copy() throws CloneNotSupportedException 
	{
		
		return super.clone();
		
	}
}
public class CloneM {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1=new Student("Divya",25);
		Student s2=(Student) s1.copy();
		System.out.println("S1- name: "+s1.name+" id: "+s1.id);
		System.out.println("S2- name: "+s2.name+" id: "+s2.id);

		//System.out.println();
	}

}
