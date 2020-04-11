package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concatinationTest {

	@Test
	void concatinationtest() {
		Square j=new Square();
		String result=j.concatination("Anum","Ashfaq");
		assertEquals("AnumAshfaq",result);
	}

}
