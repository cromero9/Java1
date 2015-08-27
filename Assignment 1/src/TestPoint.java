import java.util.Scanner;

public class TestPoint extends Point{
	public TestPoint(double x, double y, double x2, double y2) {
	super(x, y, x2, y2);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
	
		Scanner scnr = new Scanner(System.in);
	        Point pt = new Point(x, y, x2, y2);
	    

	        System.out.print("Enter the x coordinate of the first point: ");
	        pt.x = scnr.nextInt();
	        System.out.print("Enter the y coordinate of the first point: ");
	        pt.y = scnr.nextInt();
	        System.out.print("Enter the x coordinate of the second point: ");
	        pt.x2 = scnr.nextInt();
	        System.out.print("Enter the y coordinate of the second point: ");
	        pt.y2 = scnr.nextInt();
	        System.out.print("The distance between the two coordinates is: ");
	        System.out.print(pt.distance(x2,y2));
	       }
	        
	  
	        
	    
	}

