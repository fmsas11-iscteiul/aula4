package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Caravel;
import battleship.Carrack;
import battleship.Compass;
import battleship.Position;
import battleship.Ship;

public class CaravelTest {
	Ship caravel;
	Ship caravel1;
	Ship caravel2;
	Ship caravel3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		caravel = new Caravel(Compass.NORTH, new Position(4, 6));
		caravel1 = new Caravel(Compass.EAST, new Position(2, 3));
		caravel2 = new Caravel(Compass.WEST, new Position(0, 4));
		caravel3 = new Caravel(Compass.SOUTH, new Position(1, 1));
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testGetSize() {
		assertEquals(2, caravel.getSize());
		assertEquals(2, caravel1.getSize());
		assertEquals(2, caravel2.getSize());
		assertEquals(2, caravel3.getSize());
	}

}
