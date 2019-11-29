package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Carrack;
import battleship.Compass;
import battleship.Frigate;
import battleship.Position;
import battleship.Ship;

class FrigateTest {
	Ship frigate;
	Ship frigate1;
	Ship frigate2;
	Ship frigate3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		frigate = new Frigate(Compass.EAST, new Position(1, 0));
		frigate1 = new Frigate(Compass.NORTH, new Position(2, 2));
		frigate2 = new Frigate(Compass.SOUTH, new Position(3, 5));
		frigate3 = new Frigate(Compass.WEST, new Position(4, 7));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testGetSize() {
		assertEquals(4, frigate.getSize());
		assertEquals(4, frigate1.getSize());
		assertEquals(4, frigate2.getSize());
		assertEquals(4, frigate3.getSize());
	}

}
