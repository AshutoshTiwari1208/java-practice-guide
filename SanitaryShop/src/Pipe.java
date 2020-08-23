
public class Pipe {
	
	private double length;
	private int diameter;
	
	public Pipe(double length, int diameter) {
		this.length = length;
		this.diameter = diameter;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}
