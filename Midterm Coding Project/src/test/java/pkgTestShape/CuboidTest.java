package pkgTestShape;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import pkgShape.Cuboid;

public class CuboidTest {
	
	@Test 
	public void Cuboid_test(int iWidth, int iLength, int iDepth) {
		Cuboid cub = new Cuboid(5, 6, 4);
		
		assertEquals(cub instanceof Cuboid, true);
	}
	
	@Test
	public void getiDepth_test() {
		Cuboid cub = new Cuboid(5, 4, 6);
		int biDepth = cub.getiDepth(); 
		
		assertEquals(biDepth, 6);
	}
	
	@Test
	public void getiDepth_test2() {
		Cuboid cub = new Cuboid(7, 4, 3);
		int biDepth = cub.getiDepth();
		
		assertEquals(biDepth, 3);
	}
	
	@Test
	public void setiDepth_test() {
		Cuboid cub = new Cuboid(6, 5, 6);
		cub.setiDepth(5);
		
		assertEquals(cub.getiDepth(), 5);
	}
	
	@Test
	public void setiDepth_test2() {
		Cuboid cub = new Cuboid(3, 2, 6);
		cub.setiDepth(2);
		
		assertEquals(cub.getiDepth(), 6);
	}
	
	@Test
	public void area_test() {
		Cuboid cub = new Cuboid(3, 2, 6);
		int bArea = (int) cub.area();
		
		assertEquals(bArea, 52);
	}
	
	@Test 
	public void area_test2() {
		Cuboid cub = new Cuboid(1, 1, 1);
		int bArea = (int) cub.area();
		
		assertEquals(bArea, 6);
	}
	
	@Test 
	public void volume_test() {
		Cuboid cub = new Cuboid(6, 3, 2);
		int bVolume = (int) cub.volume();
		
		assertEquals(bVolume, 36);
	}
	
	@Test
	public void volume_test2() {
		Cuboid cub = new Cuboid(1, 1, 1);
		int bVolume = (int) cub.volume();
		
		assertEquals(bVolume, 1);
	}
	
	@Test
	public void perimeter_test() {
		Cuboid cub = new Cuboid(5, 6, 7);
		boolean thrown = false;
		
		try {
			cub.perimeter();
		}
		catch(UnsupportedOperationException e) {
			thrown = true;
		}
		
		assertEquals(thrown, true);
	}
	
	@Test
	public void iDepth_test() {
		boolean thrown = false;
		
		try {
			Cuboid cub = new Cuboid(5, 4, -3);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, true);
	}
	
	@Test
	public void iDepth_test2() {
		boolean thrown = false;
		
		try {
			Cuboid cub = new Cuboid(5, 3, 4);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		
		assertEquals(thrown, false);
		}
	}
	
	// Tests for SortByArea, SortByVolume
}
