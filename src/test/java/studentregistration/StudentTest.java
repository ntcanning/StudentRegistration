package studentregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void usernameTest() {
		Student john = new Student("John", 20, 12233445, "01/01/1996");
		assertEquals("John20", john.getUsername());
	}

}
