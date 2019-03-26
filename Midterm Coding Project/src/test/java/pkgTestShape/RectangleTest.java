package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void Rectangle_test() {
		Rectangle rec = new Rectangle(5, 4);
		
		assertEquals(rec instanceof Rectangle, true);
	}
	
	@Test
	public void getiWidth_test() {
		Rectangle rec = new Rectangle(5,4);
		int biWidth = rec.getiWidth(); 
		
		assertEquals(biWidth, 5);
	}
	
	@Test
	public void getiWidth_test2() {
		Rectangle rec = new Rectangle(6, 17);
		int biWidth = rec.getiWidth();
		
		assertEquals(biWidth, 6);
	}
	
	@Test
	public void setiWidth_test() {
		Rectangle rec = new Rectangle(6,5);
		rec.setiWidth(5);
		
		assertEquals(rec.getiWidth(), 5);
	}
	
	@Test 
	public void setiWidth_test2() {
		Rectangle rec = new Rectangle(200,200);
		rec.setiWidth(6);
		
		assertEquals(rec.getiWidth(), 6);
	}
	
	@Test
	public void getiLength_test() {
		Rectangle rec = new Rectangle(5,6);
		int biLength = rec.getiLength();
		
		assertEquals(biLength, 6);
	}
	
	@Test
	public void getiLength_test2() {
		Rectangle rec = new Rectangle(17,5);
		int biLength = rec.getiLength();
		
		assertEquals(biLength, 5);
	}
	
	@Test
	public void setiLength_test() {
		Rectangle rec = new Rectangle(200,200);
		rec.setiLength(6);
		
		assertEquals(rec.getiLength(), 6);
	}
	
	@Test
	public void setiLength_test2() {
		Rectangle rec = new Rectangle(1,1);
		rec.setiLength(17);
		
		assertEquals(rec.getiLength(), 17);
	}
	
	@Test
	public void area_test() {
		Rectangle rec = new Rectangle(5,6);
		int bArea = (int) rec.area();
		
		assertEquals(bArea, 30);
	}
	
	@Test
	public void area_test2() {
		Rectangle rec = new Rectangle(2,2);
		int bArea = (int) rec.area();
		
		assertEquals(bArea, 4);
	}
	
	@Test
	public void perimeter_test() {
		Rectangle rec = new Rectangle(5,6);
		int bPerimeter = (int) rec.perimeter();
		
		assertEquals(bPerimeter, 22);
	}
	
	@Test
	public void perimeter_test2() {
		Rectangle rec = new Rectangle(2,2);
		int bPerimeter = (int) rec.perimeter();
		
		assertEquals(bPerimeter, 8);
	}
	
	@Test
	public void iWidth_test() {
		boolean thrown = false;
		
		try {
			Rectangle rec = new Rectangle(-5, 4);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, true);
	}
	
	@Test
	public void iWidth_test2() {
		boolean thrown = false;
		
		try {
			Rectangle rec = new Rectangle(5, 4);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, false);
	}
	
	@Test
	public void iLength_test() {
		boolean thrown = false;
		
		try {
			Rectangle rec = new Rectangle(5, -4);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, true);
	}
	
	@Test
	public void iLength_test2() {
		boolean thrown = false;
		
		try {
			Rectangle rec = new Rectangle(5, 4);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, false);
	}
	
	//not done 
	@Test
	public void compareTo_test(Object rec) {
		
	}
}
