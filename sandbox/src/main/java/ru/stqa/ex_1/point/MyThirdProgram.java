package ru.stqa.ex_1.point;

public class MyThirdProgram {

	public static void main(String[] args) {

		Point p1 = new Point(8, 3);
		Point p2 = new Point(3, 8);

		System.out.println("Расстояние между точками p1 " + " и " + " p2 " + " = " + Math.sqrt(distance(p1, p2)));
	}

	public static double distance(Point p1, Point p2) {
		return ((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y));
	}
}