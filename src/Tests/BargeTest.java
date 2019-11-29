package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Barge;
import battleship.Compass;
import battleship.IShip;
import battleship.Position;
import battleship.Ship;

public class BargeTest {
	Ship barge;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		barge =  new Barge(Compass.WEST, new Position(2, 3));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testGetSize() {
		assertEquals(1, barge.getSize());
	}

}
