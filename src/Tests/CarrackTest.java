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

class CarrackTest {
	Ship carrack;
	Ship carrack1;
	Ship carrack2;
	Ship carrack3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		carrack = new Carrack(Compass.EAST, new Position(1, 0));
		carrack1 = new Carrack(Compass.NORTH, new Position(2, 3));
		carrack2 = new Carrack(Compass.WEST, new Position(4, 4));
		carrack3 = new Carrack(Compass.SOUTH, new Position(5, 1));
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testGetSize() {
		assertEquals(3,  carrack.getSize());
		assertEquals(3, carrack1.getSize());
		assertEquals(3, carrack2.getSize());
		assertEquals(3, carrack3.getSize());
	}

}
