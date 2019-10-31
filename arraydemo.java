package myjavaproject;

class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,3,4,40};
		for(int index=0;index<a.length;index++)
		{
			System.out.println(a[index]);
			
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]+10;
			System.out.println(a[i]);
		}
		

	}

}
