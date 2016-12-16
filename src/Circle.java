// Create Circle class with radius and PI fields
public class Circle {

	private double radius;
	private final double PI = 3.14159;

	/**
	 * The setRadius method stores a value in the length field.
	 * @param rad The value to store in radius.
	 */
	public void setRadius(double rad) {
		radius = rad;
	}
	public double getRadius(){
		return radius;
	}
	
	// get methods for area
		public double getArea() {
			double area = radius * radius * PI;
			return area;
		}
		// get method for circumference
		public double getCircumference() {
			double circumference = 2 * PI * radius;
			return circumference;
		}
}//close class Circle
