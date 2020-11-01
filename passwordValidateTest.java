import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class passwordValidateTest 
{
	@Test
	public void isEqualTest()
	{
		System.out.print("Test");
		passwordValidate validator = new passwordValidate();
		assertEquals("Here is the test for password length ->", true, validator.validatePassword("ThisPasswordIsToolongandcontainstoomanycharacterstobevalid"));
	}
}
