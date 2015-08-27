import java.lang.reflect.Array;

public class rectangleArea {
	/*
	1. Write a	class that computes	the	area of	a rectangle	for	any	of the	
			following parameters:	int, double, long	
	2.	Write a	method that	computes the average of	an array of	integers.	
			Example: [4, 16, 10] ->	10	
	3.	Write a	method that computes the average length	of an array	of Strings.	
			Example: [“Tim”, “John”, “Ed”] -> 3	+ 4	+ 2	/ 3	= 3
	*/	
	
	
	public static void main(String[] args) {
		System.out.println("Area of rectangle int " + computeArea(5, 2));
		System.out.println("Area of rectangle double " + computeArea(5.5, 5.2));
		System.out.println("Area of rectangle long " + computeArea(5.5, 5.2));
	}
	
	public static int computeArea(int length, int width) {
		return length * width;
		
	}
	public static double computeArea(double lenght, double width) {
		return lenght * width;
		
	}
	public static int computeArea(long num) {
		return num *= 4;
	
	}
	public static int computeIntArray(Array num) {
		return 0;
	
	}
	public static int lenArrayStrings(Array num) {
		return 0;
	
	}
}
