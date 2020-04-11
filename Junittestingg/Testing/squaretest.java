/**
 * 
 */
package Testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

/**
 * @author Hp
 *
 */
class squaretest {

	@Test
	public void squaretest() {
		Square junit=new Square();
		int s=2;
		assertNotNull(s);
		int result= junit.squaring(2);
		assertEquals(4,result);
	}
public void Test2() {
	Square junit=new Square();
	int s=3;
	assertNotNull(s);
	int result= junit.squaring(s);
	assertNotEquals(9,result);
}
public void Test3() {
	Square junit=new Square();
	int s=0;
	
	int result= junit.squaring(s);
	assertNotEquals(0,result);
}
}
