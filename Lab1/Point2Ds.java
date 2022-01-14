import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Point2Ds {
	private Point2D[] points;
	
	public Point2D getPoint(int i) {
		// Return the point object at index i 
		
		// Put your code here
		
		return this.points[i];
	}
	
	public void readFromFile(String filename) throws FileNotFoundException {
		// Read the file at the cwd\src\filename
		this.points = new Point2D[20];
		
		File text = new File(System.getProperty("user.dir")+"\\src\\"+filename);
		Scanner reader = new Scanner(text);
		int i = 0; // Count i from 0
		while(reader.hasNextLine()) {
			String line = reader.nextLine(); // Read a line
			String[] lineArr = line.split(" "); // Split the string
			
			// Populate points[] with the data
			double x = Double.parseDouble(lineArr[0]);
			double y = Double.parseDouble(lineArr[1]);
			
			points[i] = new Point2D(x,y);
			i++; // Increase i by 1
		}
		
		reader.close();
	}
	
	public Point2D getClosestPointToOrigin() {
		// Return the point that is closest to the origin 
		
		// Using the method getClosestPoint to simplify the repetition
		return this.getClosestPoint(0, 0);
	}

	public Point2D getClosestPoint(double x,double y) {
		// Return the point that is closest to x,y 

		// Initialization and Assignment
		double leastDistance = Double.POSITIVE_INFINITY; // +infinity
		Point2D closetPoint = null;
		Point2D origin = new Point2D(x,y);
		
		// Loop through points[] array
		for (Point2D point2d : points) {
			double d = point2d.distance(origin);
			if (d < leastDistance) { // If the d is less than the leastDistance
				leastDistance = d;
				closetPoint = point2d;
			}
		}
		
		
		
		return closetPoint;
	}
	
}
