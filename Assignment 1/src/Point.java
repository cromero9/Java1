
//import java.util.Scanner;



class Point
{
  static double x;
  static double y;
  static double x2;
  static double y2;
  //Scanner scan = new Scanner(System.in);

  public Point(double x, double y, double x2, double y2) {
    this.x = x;
    this.y = y;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double getX() { 
	  return(this.x);
	  }
  public double getY() { 
	  
	  return(this.y); 
	  }

  public double distance(double x2, double y2) {
	    return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
	}
  public double distance(Point that) {
	    return( this.distance(that.getX(), that.getY() ) );
	  }


  public static void main(String[] args) {
    //System.out.println(new Point(10D, 10D).distance(new Point(0D,0D)));
  }
}