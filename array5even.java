package myjavaproject;

class array5even
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=257,size=5;
		int[] a=new int[size];
		for(int i=0;i<a.length;n++)
		{
			if(n%2==0)
			{
				a[i++]=n;
		    }
		}
			System.out.println("array is");
			
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);

	}

}
