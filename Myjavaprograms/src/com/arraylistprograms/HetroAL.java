package com.arraylistprograms;
 import java.util.ArrayList;
class HetroAL {

	public static void main(String[] args) {
		ArrayList hetro=new ArrayList();
		hetro.add(new Bike("Red",60));
		hetro.add(new Bike("Vishnu",1));
		Movie m= new Movie("KGF",5);
		hetro.add(m);
		hetro.add(10);

	}

}
