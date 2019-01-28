package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Person;

class PersonTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		Person P1 = new Person("Albert", "Lachance", "Male");
		assertEquals("Albert Lachance", P1.getName());
	}

	public void testGetGender() {
		Person P1 = new Person("Albert", "Lachance", "Male");
		assertEquals("Male", P1.getGender());
	}
}
