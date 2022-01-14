
public class Point2D {
	private double x;
	private double y;
	public Point2D(double x,double y) {
		// Initialize x,y
		this.x = x;
		this.y = y;
	}
	public double getY() {
		// Return y
		return y;
	}
	public void setY(double y) {
		// Set value Y
		this.y = y;
	}
	public double getX() {
		// Return x
		return x;
	}
	public void setX(double x) {
		// Set value x
		this.x = x;
	}
	public double distance(Point2D other) {
		// Calculate distance between two points
		double x2 = other.getX();
		double y2 = other.getY();
		
		return Math.sqrt(Math.pow(this.x-x2,2)+Math.pow(this.y-y2,2));
	}
}
