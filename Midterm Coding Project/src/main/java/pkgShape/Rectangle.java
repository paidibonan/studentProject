package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength){
		this.iWidth = iWidth;
		this.iLength = iLength;
		if (iWidth < 0) {
			throw new IllegalArgumentException("Error: width cannot be negative");
		}
		if (iLength < 0) {
			throw new IllegalArgumentException("Error: length cannot be negative.");
		}		
	}

	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		this.iLength = length;
	}

	@Override
	public double area() {
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		return (2 * iLength) + (2 * iWidth);
	}
	
	//not done
	@Override
	public int compareTo(Rectangle o) {
		return 0;
	}

}
