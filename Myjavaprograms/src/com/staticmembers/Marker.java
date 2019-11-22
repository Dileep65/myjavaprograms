package com.staticmembers;

class Marker {
	static int price;
	static String colour;
		static void writing()
		{
			System.out.println("marker of colour"+colour+"is writing");
			
		}

	public static void main(String[] args) {
		System.out.println(Marker.price);
		System.out.println(Marker.colour);
		Marker.price=100;
		Marker.colour="black";
		Marker.price=80;
		Marker.colour="blue";
		System.out.println("marker color"+Marker.colour+"of price"+Marker.price);
		Marker.writing();
	}
}

