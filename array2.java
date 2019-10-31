package myjavaproject;

class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int[]array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0,j=1;i<array.length;i++)
		{
			array[i]=j++;/*print nstural number*/
			System.out.println(array[i]);
		}
		for(int i=array.length-1;i>=0;i--)/*array in reverse order*/
		{
			System.out.println(array[i]);
		}

	}

}
