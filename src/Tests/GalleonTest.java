package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Compass;
import battleship.Frigate;
import battleship.Galleon;
import battleship.Position;
import battleship.Ship;

public class  GalleonTest {
	Ship galleon;
	Ship galleon1;
	Ship galleon2;
	Ship galleon3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		galleon = new Galleon(Compass.EAST, new Position(1, 0));
		galleon1 = new Galleon(Compass.WEST, new Position(3, 3));
		galleon2 = new Galleon(Compass.NORTH, new Position(7, 2));
		galleon3 = new Galleon(Compass.SOUTH, new Position(9, 6));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testGetSize() {
		assertEquals(5, galleon.getSize());
		assertEquals(5, galleon1.getSize());
		assertEquals(5, galleon2.getSize());
		assertEquals(5, galleon3.getSize());
	}

}
