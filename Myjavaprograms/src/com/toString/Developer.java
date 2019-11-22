package com.toString;

class Developer extends Employee {
	String language;
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	Developer(int id,String name,double salary,String language)
	{
		super(id, name, salary);
		this.language=language;
	}
	public boolean equal(Object ob)
	{
		Developer temp=(Developer)ob;
		return super.equals(ob) && this.language.equals(((Developer)ob).language);
	}
	

}
