package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Barge;
import battleship.Compass;
import battleship.Fleet;
import battleship.IShip;
import battleship.Position;

public class FleetTest {
	Fleet f;
	Barge b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		f = new Fleet();
		b = new Barge(Compass.NORTH, new Position(0,0));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddShip() {
		assertTrue(f.addShip(b));
		
	}

	@Test
	void testListShipsLike() {
		f.addShip(b);
		List<IShip> l = new ArrayList<IShip>();
		l.add(b);
		assertEquals(l,f.listShipsLike(b.getCategory()));
	}

	@Test
	void testListFloatingShips() {
		f.addShip(b);
		List<IShip> l = new ArrayList<IShip>();
		l.add(b);
		assertEquals(l,f.listFloatingShips());
	}

	@Test
	void testListAllShips() {
		f.addShip(b);
		List<IShip> l = new ArrayList<IShip>();
		l.add(b);
		assertEquals(l,f.listAllShips());
	}

	@Test
	void testShipAt() {
		f.addShip(b);
		List<IShip> l = new ArrayList<IShip>();
		l.add(b);
		assertEquals(b,f.shipAt(new Position(0, 0)));
	}

}
