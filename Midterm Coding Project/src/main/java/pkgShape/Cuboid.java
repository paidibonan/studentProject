package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparator<Cuboid> {
	
	private int iDepth;
	public class SortByArea implements Comparator<Cuboid>{
		SortByArea() {
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.area() - b.area());
		}
		
	}
	public class SortByVolume implements Comparator<Cuboid>{
		SortByVolume() {
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.volume() - b.volume());
		}
	}
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
		if(iDepth < 0) {
			throw new IllegalArgumentException("Error; depth cannot be negative");
		}
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		return super.getiWidth() * super.getiLength() * iDepth;
	}
	
	@Override
	public double area() {
		return (2 * (super.getiLength() * super.getiWidth())) +
				(2 * (super.getiLength() * this.getiDepth())) +
				(2 * (super.getiWidth()) * this.getiDepth()));
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Error: you cannot find the perimeter of a cuboid");
	}
	
	// not done
	public int compareTo(Cuboid o) {
		return o.
	}
	
}
