import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in the angle for the first point");
		double x1 = scan.nextInt();
		System.out.println("Type in the distance of the first point");
		double y1 = scan.nextInt();
		Point4 point = new Point4();
		point.setX(x1, y1);
		point.setY(y1, y1);
		
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Type in a the angle for the second point");
		int x2 = scan.nextInt();
		System.out.println("Type in the distance for the second point");
		int y2 = scan.nextInt();
		Point4 point2 = new Point4();               
		point2.setX(x2, y2);
		point2.setY(x2, y2);
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("WHAT WOULD YOU LIKE TO DO? (quadrant?, midpoint?, distance?, slope?)");		
		String thing = scan3.next();
		if (thing.equals("quadrant"))
		{
			System.out.println("Quadrant: " + point.quadrants());
		}
		
		if (thing.equals("midpoint"))
		{
			System.out.println(point.midpointTo(point2));
		}
		
		if (thing.equals("distance"))
		{
			System.out.println(point.distanceTo(point2));
		}
		
		if (thing.equals("slope"))
		{
			System.out.println(point.slopeTo(point2));
		}
	
	
		
	}

}
