package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Barge;
import battleship.Caravel;
import battleship.Carrack;
import battleship.Compass;
import battleship.Fleet;
import battleship.Frigate;
import battleship.Galleon;
import battleship.Game;
import battleship.IFleet;
import battleship.Position;

public class GameTest {

	Game g;
	IFleet f;

	@BeforeAll
	static void setUpBeforeClass()  throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		f=  new Fleet();
		f.addShip(new Barge(Compass.SOUTH, new Position(0, 0)));
		f.addShip(new Galleon(Compass.NORTH, new Position(1, 0)));
		f.addShip(new Frigate(Compass.EAST, new Position(0, 1)));
		f.addShip(new Carrack(Compass.WEST, new Position(1, 1)));
		f.addShip(new Caravel(Compass.SOUTH, new Position(2, 0)));
		g= new Game(f);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFire() {
		assertEquals(null, 	g.fire(new Position(-1, -1)));
		assertEquals(null, g.fire(new Position(f.SQUAREGRIDSIZE+2, -1)));
		assertEquals(f.shipAt(new Position(0, 0)), g.fire(new Position(0,0)));
	}

	@Test
	void testGetShots() {
		g.fire(new Position(1,1));
		assertEquals(1, g.getShots().size());
	}

	@Test
	void testGetRepeatedShots() {
		g.fire(new Position(0, 0));
		g.fire(new Position(0, 0));
		assertEquals(1, g.getRepeatedShots());
	}

	@Test
	void testGetInvalidShots() {
		g.fire(new Position(-1, 0));
		assertEquals(1, g.getInvalidShots());
	}

	@Test
	void testGetHits() {
		g.fire(new Position(0,0));
		assertEquals(1, g.getHits());
	}

	@Test
	void testGetSunkShips() {
		g.fire(new Position(0,0));
		assertEquals(1, g.getSunkShips());
	}

	@Test
	void testGetRemainingShips() {
		assertEquals(f.listAllShips().size(), g.getRemainingShips());
	}

}