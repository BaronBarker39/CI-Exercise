package CS_348_SP_2020.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2020.CIExercise.EndsWith5;

public class EndsWith5Test {

	@Test
	public void testToString() {
		EndsWith5 five = new EndsWith5();
		// add your name to the expected string, after all the other names in the form John Smith\n
		assertEquals("EndsWith5 [names=]", five.toString());

	}

}
