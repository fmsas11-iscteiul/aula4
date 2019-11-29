package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import battleship.Position;

public class PositionTest {
	Position p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		p = new Position(0, 0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetRow() {
		assertEquals(0, p.getRow());
	}

	@Test
	void testGetColumn() {
		assertEquals(0, p.getColumn());
	}

	@Test
	void testEqualsIPosition() {
		assertTrue(p.equals(new Position(0,0)));
		
	}
	
	@Test
	void testEquals() {
		Position other = new Position(0,0);
		assertEquals(p.getRow() == other.getRow()
				&& p.getColumn() == other.getColumn(),p.equals(other));
		
	}

	@Test
	void testIsAdjacentTo() {
		Position ptrue = new Position(0, 1);
		Position pfalse = new Position(0, 5);
		assertTrue(p.isAdjacentTo(ptrue));
		assertFalse(p.isAdjacentTo(pfalse));
	}

	@Test
	void testOccupy() {
		assertFalse(p.isOccupied());
		p.occupy();
		assertTrue(p.isOccupied());
	}

	@Test
	void testShoot() {
		assertFalse(p.isHit());
		p.shoot();
		assertTrue(p.isHit());
	}

	@Test
	void testIsOccupied() {
		assertFalse(p.isOccupied());
	}

	@Test
	void testIsHit() {
		assertFalse(p.isHit());
	}

	@Test
	void testToString() {
		String s = ("Linha = " + p.getRow() + " Coluna = " + p.getColumn());
		assertEquals(s, p.toString());
	}

}
