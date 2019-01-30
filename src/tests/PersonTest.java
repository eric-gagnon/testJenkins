package tests;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.Person;

public class PersonTest extends TestCase {

	@Test
    public void testTrue() {
        assertTrue(true);
    }
	/*
	@Test
	public void testFalse() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGetName() {
		Person P1 = new Person("Albert", "Lachance", "Male");
		assertEquals("Albert Lachance", P1.getName());
	}

	@Test
	public void testGetGender() {
		Person P1 = new Person("Albert", "Lachance", "Male");
		assertEquals("Male", P1.getGender());
	}
}
