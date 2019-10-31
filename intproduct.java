package myjavaproject;

class intproduct {

	public static void proint(int a,int b)
	{
	   System.out.println(a*b);

	}
	public static void proint(int c,int d,int e)
	{
		System.out.println(c*d*e);
	}
	public static void proint(double x, double y)
	{
		System.out.println(x*y);
	}
	
	public static void main(String[] args)
	{
		proint(5,6);
		proint(1,5,6);
		proint(1.5,2.5);
	}

}
