package com.toString;

class TestEngineer extends Employee {
	String tool;
   TestEngineer() {}
	TestEngineer(int id,String name,double salary,String tool)
	{
		super(id,name,salary);
		this.tool=tool;
	}
	public boolean equal(Object ob)
	{
		TestEngineer temp=(TestEngineer)ob;
		return super.equals(ob) && this.tool==temp.tool;
	}
	public int hashCode()
	{
		int hs=super.hashCode()+tool.hashCode();
		return hs;
	}
}
